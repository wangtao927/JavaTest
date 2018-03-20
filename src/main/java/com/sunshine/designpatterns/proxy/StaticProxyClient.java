package com.sunshine.designpatterns.proxy;

/**
 * Created by wangtao on 2018/3/20.
 */
public class StaticProxyClient {

    public static void main(String[] args) {
        StaticProxy client = new StaticProxy(new Subject());
        client.getSubject();


    }
}
