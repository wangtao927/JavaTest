package com.sunshine.thread.mutithread;

/**
 * Created by wangtao on 2018/2/27.
 */
public class PrintABC {


    private volatile int state = 0;

    class Printer implements Runnable {

        private static final int PRINT_COUNT= 10;

        private final Object printLock;
        private final int printFlag;
        private final char printChar;
        private final int nextPrintFlag;

        public Printer(Object printLock, int printFlag, int nextPrintFlag,char printChar) {
            this.printLock = printLock;
            this.printFlag = printFlag;
            this.printChar = printChar;
            this.nextPrintFlag = nextPrintFlag;
        }

        @Override
        public void run() {
            synchronized (printLock) {
                for (int i = 0; i < PRINT_COUNT; i++) {
                    while (state != printFlag) {
                        try {
                            printLock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(printChar);
                    state = nextPrintFlag;
                    printLock.notifyAll();
                }
            }
        }
    }

    void test() {
        Object lock = new Object();
        Thread threadA = new Thread(new Printer(lock, 0, 1 , 'A'));
        Thread threadB = new Thread(new Printer(lock, 1, 2 , 'B'));
        Thread threadC = new Thread(new Printer(lock, 2, 0 , 'C'));
        threadA.start();
        threadB.start();
        threadC.start();

    }


    public static void main(String[] args) {

         PrintABC printABC = new PrintABC();
         printABC.test();


    }

}
