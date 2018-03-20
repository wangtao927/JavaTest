package com.sunshine.distributelock.zk;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangtao on 2018/3/16.
 */
public class DistributeLockUtil {


    static CuratorFramework client= CuratorFrameworkFactory.newClient("", new ExponentialBackoffRetry(1000, 3));

    static String basePath = "lock/";

    public static boolean tryLock(String key, int timeout) {

        InterProcessMutex lock = new InterProcessMutex(client, basePath + "/" + key);
        try {
            return lock.acquire(timeout, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;

    }

    public static void releaseLock() {

    }
}
