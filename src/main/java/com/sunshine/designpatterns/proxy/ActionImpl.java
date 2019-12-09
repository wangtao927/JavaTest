package com.sunshine.designpatterns.proxy;

public class ActionImpl implements IAction {

    @Override
    public String doSomething() {
        System.out.println("do something");
        return "success";
    }
}
