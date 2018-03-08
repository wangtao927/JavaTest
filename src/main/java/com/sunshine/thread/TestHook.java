package com.sunshine.thread;

/**
 * Created by wangtao on 2018/3/6.
 */
public class TestHook {

    public static void main(String[] args) {
        System.out.println("main");
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hook");
            }
        }));
    }
}
