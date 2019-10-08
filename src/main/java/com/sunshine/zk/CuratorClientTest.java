package com.sunshine.zk;

import org.apache.curator.CuratorZookeeperClient;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;

public class CuratorClientTest {

    private static String ip = "192.168.99.100:32771,192.168.99.100:32770,192.168.99.100:32769";

    public static void main(String[] args) {
        CuratorZookeeperClient zkClient = CuratorFrameworkFactory.newClient(ip, new RetryOneTime(1000))
                .getZookeeperClient();


    }
}
