package com.sunshine.designpatterns.adapter;

/**
 *  类适配器
 * Created by wangtao on 2018/3/23.
 */
public class AdapterA extends Adaptee implements Target {

    @Override
    public void doSomethine() {
        System.out.println("AdaterA do something");
    }
}
