package com.sunshine.thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 顺序执行多线程
 * 1. 利用join 方法 （底层使用wait方式）
 * 2. 利用 线程池中的single thread
 *
 */
public class MutiThreadExecute {

    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("1");
        }
    });
    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("2");
        }
    });
    Thread t3 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("3");
        }
    });

    public static void main(String[] args) throws InterruptedException {
        MutiThreadExecute mutiThreadExecute = new MutiThreadExecute();
        // 1. 方法1  利用join方式
//        mutiThreadExecute.t1.start();
//        mutiThreadExecute.t1.join();
//        mutiThreadExecute.t2.start();
//        mutiThreadExecute.t2.join();
//        mutiThreadExecute.t3.start();

        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(mutiThreadExecute.t1);
        service.submit(mutiThreadExecute.t2);
        service.submit(mutiThreadExecute.t3);
    }
}
