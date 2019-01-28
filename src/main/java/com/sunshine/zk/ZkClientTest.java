package com.sunshine.zk;

import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;

public class ZkClientTest {

    private static String ip = "xxxx:2181,xxxx:2182,xxxx:2183";
    public static void main(String[] args) {

        ZkClient client =  new ZkClient(ip);
        System.out.println("connect success");
        String result = client.create("/test1", "t", CreateMode.PERSISTENT);
        System.out.println("create result:" + result);


//        boolean delResult = client.delete("/test");
//        boolean delResult1 = client.delete("/test1");
//        System.out.println("delete result:" + delResult);
//        System.out.println("delete result1:" + delResult1);
    }



}
