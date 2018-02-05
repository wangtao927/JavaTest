package com.sunshine.proxy;

/**
 * Created by wangtao on 2018/1/23.
 */
public class GamePlayer implements IGamePlayer {

    @Override
    public void online(String name) {
        System.out.println(name+ " 登录了游戏");
    }

    @Override
    public void play(String name) {
        System.out.println(name + " 开始玩游戏");
    }

    @Override
    public void upgrade(String name, int level) {
       System.out.println(name + "升了" + level + "级");
    }

    @Override
    public void offline(String name) {

        System.out.println(name + "退出了游戏");
    }
}
