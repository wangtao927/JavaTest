package com.sunshine.pool;

import java.util.concurrent.*;

/**
 * Created by wangtao on 2018/4/16.
 */
public class ThreadPoolTest {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = new ThreadPoolExecutor(1,  3,
            60L, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(5));

        CountDownLatch cdl = new CountDownLatch(20);
        for (int i = 0; i < 20; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("start execute currentThread:" + Thread.currentThread().getId());
                        Thread.sleep(3000);
                        System.out.println("`````````````end execute currentThread:" + Thread.currentThread().getId());
                        cdl.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        cdl.await();
        System.out.println("end");

    }

    public void testWorkStealPool() {
        ExecutorService executorService = Executors.newWorkStealingPool();

        executorService.execute(()->{
            System.out.println("test");
        });
    }
}
