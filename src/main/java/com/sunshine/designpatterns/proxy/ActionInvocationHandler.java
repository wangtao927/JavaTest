package com.sunshine.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ActionInvocationHandler implements InvocationHandler {

    private Object obj;

    public ActionInvocationHandler(Object proxy) {
        this.obj = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("proxy start");
        Object result = method.invoke(obj, args);
        System.out.println("proxy end");
        return result;
    }
}
