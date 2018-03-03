package com.sunshine.thread.threadlocal;

/**
 * Created by wangtao on 2018/2/1.
 */
public class TestThreadLocal {

    private static ThreadLocal<String> local = new ThreadLocal<>();

    static String tmp;

    public static void main(String[] args) {


//        final String tmp = "";
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                    local.set(tmp+=5);
                    System.out.println(local.get() +"tmp:" + tmp);
                }
            }).start();
        }

    }
}
