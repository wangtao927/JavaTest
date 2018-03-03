package com.sunshine.thread.mutithread;

/**
 * Created by wangtao on 2018/2/27.
 */
public class ThreadState {


    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getState());

            }
        });

        System.out.println("before start:"+ t1.getState());
        t1.start();

        System.out.println("after start:"  + t1.getState());

        t1.sleep(2000);
        System.out.println("after wait:" + t1.getState());

        t1.join();
        System.out.println("after join:" + t1.getState());

    }


}
