package com.sunshine.designpatterns.single;

/**
 * 单例模式  恶汉模式
 * Created by wangtao on 2018/3/20.
 */
public class Singleton1 {

    private static Singleton1 INSTANCE = new Singleton1();

    public static Singleton1 getInstance() {
        return INSTANCE;
    }


}
