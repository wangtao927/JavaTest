package com.sunshine.thread.mutithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangtao on 2018/3/2.
 */
public class TestVolatile {

    volatile int i = 0;
//    int i = 0;

    public void setVolatile() {
        i++;
        System.out.println("after set i=" + i);
    }

    public int get() {
        System.out.println("get i = " + i);
        return i;
    }

//    public static void main(String[] args) {
//        TestVolatile testVolatile = new TestVolatile();
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                testVolatile.setVolatile();
//                testVolatile.get();
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                testVolatile.get();
//                testVolatile.setVolatile();
//            }
//        });
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 5; i++) {
//            executorService.execute(t1);
//            executorService.execute(t2);
//        }
//
//    }
}
