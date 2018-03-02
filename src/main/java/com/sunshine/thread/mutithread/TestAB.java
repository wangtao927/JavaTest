package com.sunshine.thread.mutithread;

/**
 * Created by wangtao on 2018/3/1.
 */
public class TestAB {

    int a = 0;
    int b = 0;

    int x = 0;

    int y = 0;

    public void updateA() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                a = 1;
                x = b;
            }
        }).start();
    }
    public void updateB() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                b = 2;
                y = a;
            }
        }).start();
    }

    public static void main(String[] args) throws InterruptedException {
        TestAB ab = new TestAB();
        ab.updateA();
        ab.updateB();
        Thread.sleep(1000);
        System.out.println("x=" + ab.x);
        System.out.println("y=" + ab.y);
    }
}
