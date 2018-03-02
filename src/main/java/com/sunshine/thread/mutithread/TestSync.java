package com.sunshine.thread.mutithread;

/**
 * Created by wangtao on 2018/3/1.
 */
public class TestSync {

    int i = 0;

    public void testSyncLock() {
        synchronized (this) {
             i++;
        }
    }
}
