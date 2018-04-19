package com.sunshine.thread;

/**
 * Created by wangtao on 2018/4/18.
 */
public class TestSych {

    private Object mutiLock = new Object();

    int i = 0;

    public void testMethod() {
        synchronized (mutiLock) {
            i++;
            System.out.println(i);
        }
    }

}
