package com.sunshine.designpatterns.proxy;

/**
 * Created by wangtao on 2018/1/23.
 */
public class CglibProxyClient {

    public static void main(String[] args) {
         CglibProxyHandler proxyHandler = new CglibProxyHandler();
       GamePlayer gamePlayer =(GamePlayer) proxyHandler.getProxy(GamePlayer.class);
        gamePlayer.online("wangt");
        gamePlayer.play("wangt");
    }
}
