package com.sunshine.thread.mutithread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * Created by wangtao on 2018/3/2.
 */
public class TestMutiThread {

    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[]  threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("threadId:"+ threadInfo.getThreadId() + "  name=" + threadInfo.getThreadName());
        }
    }
}
