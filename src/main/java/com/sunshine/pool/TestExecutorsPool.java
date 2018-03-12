package com.sunshine.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangtao on 2018/3/12.
 */
public class TestExecutorsPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newWorkStealingPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId());
            }
        });
    }
}
