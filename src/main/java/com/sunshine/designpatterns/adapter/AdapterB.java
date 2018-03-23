package com.sunshine.designpatterns.adapter;

/**
 * Created by wangtao on 2018/3/23.
 */
public class AdapterB {

    Adaptee adaptee = new Adaptee();

    TargetImpl target = new TargetImpl();

    public void do1() {
        target.doSomethine();
    }

    public void do2() {
        adaptee.dosomething2();
    }
}
