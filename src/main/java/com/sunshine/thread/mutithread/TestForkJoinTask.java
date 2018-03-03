package com.sunshine.thread.mutithread;

import java.util.concurrent.RecursiveTask;

/**
 * Created by wangtao on 2018/3/1.
 */
public class TestForkJoinTask extends RecursiveTask {

    private int threadhold = 2;

    private int start = 0;
    private int end = 0;

    public TestForkJoinTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Object compute() {

        int sum = 0;

        boolean canCompute = (end - start) <= threadhold;
        if (canCompute) {

            for (int i = start; i <= end; i++) {
                sum+=i;
            }
            
        } else {
           int middle = (start+end)/2;
           TestForkJoinTask left = new TestForkJoinTask(start, middle);
           TestForkJoinTask right = new TestForkJoinTask(middle+1, end);
           left.fork();
           right.fork();
           sum = (int)left.join() +  (int)right.join();

        }
        return sum;
    }
}
