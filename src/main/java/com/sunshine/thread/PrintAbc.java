package com.sunshine.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class PrintAbc {
    ReentrantLock lock = new ReentrantLock();
    static int i = 1;
    public static void main(String[] args) throws InterruptedException {
        PrintAbc a = new PrintAbc();


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                    a.print(i++);


            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                    a.print(i++);


            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                    a.print(i++);


            }
        });
        t1.start();

        t2.start();

        t3.start();
    }

    synchronized void print(int num) {
        for (int j = 0; j < 10; j++) {
            lock.lock();
            boolean flag = false;
            while (!flag) {
                if (num % 3 == 1) {
                    System.out.println("A" + num);
                    flag = true;
                } else if (num % 3 == 2) {
                    System.out.println("B" + num);
                    flag = true;
                } else if (num % 3 == 0) {
                    System.out.println("C" + num);
                    flag = true;
                }
            }
            lock.unlock();
        }
    }
}
