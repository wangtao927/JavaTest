package com.sunshine.designpatterns.adapter;

/**
 * Created by wangtao on 2018/3/23.
 */
public class TargetImpl implements Target {
    @Override
    public void doSomethine() {
        System.out.println("target method : do something");
    }
}
