package com.facishare.test.listener;

/**
 * Created by dingc on 2016/3/2.
 */
public class TestListener {

    public void handMessage(String info) {
        System.out.println("#####################recive message content :" + info);
        try {
            Thread.sleep(1000);
            throw new RuntimeException("");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        throw new RuntimeException("test a exception");
    }

}
