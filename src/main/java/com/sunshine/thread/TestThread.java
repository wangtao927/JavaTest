package com.sunshine.thread;

/**
 * Created by wangtao on 2018/1/30.
 */
public class TestThread {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(2);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(3);
            }
        }).start();

    }
}
