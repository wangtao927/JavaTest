package com.sunshine.thread;

/**
 * Created by wangtao on 2018/3/6.
 */
public class TestDeadLock {

    private static  Object o1 = new Object();
    private static  Object o2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(){
            @Override
            public void run(){
                //抢占资源 o1
                synchronized (o1) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t1 ---Get o1");

                    //需要资源o2 但是 t2 独占(未释放) -->互相竞争资源-->死锁
                    synchronized(o2){
                        System.out.println("t1 ---Get o2");
                    }


                }
            }

        };


        Thread t2 = new Thread(){
            @Override
            public void run(){
                //抢占资源o2
                synchronized (o2) {
                    System.out.println("t2 ---Get o2");

                    //需要资源 o1,但是 t1 独占(未释放) -->互相竞争资源-->死锁
                    synchronized (o1) {
                        System.out.println("t2 ---Get o1");
                    }
                }

            }

        };


        t1.start();
        t2.start();



    }
}
