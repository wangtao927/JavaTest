package com.sunshine.designpatterns.proxy;

/**
 * Created by wangtao on 2018/1/23.
 */
public interface IGamePlayer {

    void online(String name);

    void play(String name);

    default void upgrade(String name, int level) {
        System.out.println("default--- name: " + name + " level:" + level);
    }

    void offline(String name);



}
