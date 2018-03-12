package com.sunshine.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangtao on 2018/3/9.
 */
public class TestExecutors {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });

        Executors.newWorkStealingPool().execute(new Runnable() {
            @Override
            public void run() {

            }
        });

    }
}
