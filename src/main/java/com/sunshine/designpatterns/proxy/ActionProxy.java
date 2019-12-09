package com.sunshine.designpatterns.proxy;

import java.lang.reflect.Proxy;

public class ActionProxy {

    public static void main(String[] args) {
        IAction iAction = new ActionImpl();
        ActionInvocationHandler actionInvocationHandler = new ActionInvocationHandler(iAction);

        IAction iActionProxy = (IAction) Proxy.newProxyInstance(iAction.getClass().getClassLoader(),
                new Class[]{IAction.class}, actionInvocationHandler);

        iActionProxy.doSomething();

    }
}
