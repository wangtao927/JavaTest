package com.sunshine.proxy;

import cn.hutool.aop.ProxyUtil;

import java.lang.reflect.Proxy;

/**
 * Created by wangtao on 2018/1/23.
 */
public class ProxyClient {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer();

        MyJdkProxyHandler proxyHandler = new MyJdkProxyHandler(gamePlayer);

        ClassLoader loader = gamePlayer.getClass().getClassLoader();
        IGamePlayer proxyPlayer = (IGamePlayer) Proxy.newProxyInstance(loader, new Class[]{IGamePlayer.class}, proxyHandler);
        proxyPlayer.online("wangt");
        proxyPlayer.play("wangt");
    }
}
