package com.sunshine.thread.mutithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by wangtao on 2018/3/1.
 */
public class TestForkJoin {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        System.out.println(forkJoinPool.submit(new TestForkJoinTask(1,10)).get());
    }

}
