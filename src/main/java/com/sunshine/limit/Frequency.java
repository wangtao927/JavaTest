package com.sunshine.limit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class Frequency {
    private long maxCount; // 单位时间最大访问数
    private int limit; // 时间段
    private AtomicLong num;
    private volatile long countTime;
    private volatile long slowTime;

    public Frequency(int maxCount, int limitSecond) {
        this.num = new AtomicLong();
        this.maxCount = maxCount;
        this.countTime = System.currentTimeMillis();
        this.limit = limitSecond * 1000;
    }

    public  long incWait() throws InterruptedException {
        long count;
//        if (slowTime != 0) {
//            Thread.sleep(slowTime);
//            slowTime = 0;
//        }
        while (true) {
            count = this.num.incrementAndGet();
            if (count >= maxCount) {
                Thread.sleep(100);
            } else {
                return count;
            }
            refreshTime();
        }
    }

    private void refreshTime() {
        long nowTime = System.currentTimeMillis();
        if (nowTime - countTime > limit) {
            this.num.set(0);
            this.countTime = nowTime;
        }
    }

    public void slowDown(long slowTime) {
        this.slowTime = slowTime;
    }



    public static void main(String[] args) throws InterruptedException {
        final Frequency frequency = new Frequency(3, 1);

        ExecutorService executors = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            executors.execute(() -> {
                try {
                    frequency.incWait();
                    System.out.println(System.currentTimeMillis() / 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
