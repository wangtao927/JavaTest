package com.sunshine.proxy;

/**
 * Created by wangtao on 2018/1/23.
 */
public interface IGamePlayer {

    void online(String name);

    void play(String name);

    void upgrade(String name, int level);

    void offline(String name);

}
