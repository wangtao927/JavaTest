package com.sunshine.thread;

/**
 * Created by wangtao on 2018/3/6.
 */
public class MyDaemonThread {

    private static class DaemonThread extends Thread {

        public DaemonThread() {
            setDaemon(true);
        }

        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new DaemonThread();
        thread.start();
        System.out.println(thread.isAlive() + "---" + thread.getState());

        thread.join();
        System.out.println(thread.isAlive() + "---" + thread.getState());
    }
}
