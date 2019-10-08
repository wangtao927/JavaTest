package com.sunshine.zk;

import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;

import java.util.List;

public class ZkClientTest {

    private static String ip = "192.168.99.100:32771,192.168.99.100:32770,192.168.99.100:32769";
    public static void main(String[] args) {

        ZkClient client =  new ZkClient(ip);
        System.out.println("connect success");

        String path = "/test1";
        boolean delResult1 = client.delete(path);
        System.out.println("delete result1:" + delResult1);

        String result = client.create(path, "t", CreateMode.PERSISTENT);
        System.out.println("create result:" + result);
//        boolean delResult = client.delete("/test");
//        System.out.println("delete result:" + delResult);



        List list = client.getChildren(path);
        System.out.println("children:" + list);

        String data = client.readData(path);
        System.out.println("zk getData = " + data);

        delResult1 = client.delete(path);
        System.out.println("delete result1:" + delResult1);
    }



}
