package com.sunshine.zk;

import org.apache.curator.CuratorZookeeperClient;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;

public class CuratorClientTest {

    private static String ip = "xxxx:2181,xxxx:2182,xxxx:2183";

    public static void main(String[] args) {
        CuratorZookeeperClient zkClient = CuratorFrameworkFactory.newClient(ip, new RetryOneTime(1000))
                .getZookeeperClient();



    }
}
