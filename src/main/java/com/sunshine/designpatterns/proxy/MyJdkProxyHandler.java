package com.sunshine.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wangtao on 2018/1/23.
 */
public class MyJdkProxyHandler implements InvocationHandler {

    private Object obj;

    public MyJdkProxyHandler(Object proxy) {
        this.obj = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理中...");
        Object result = method.invoke(obj, args);
        System.out.println("代理结束...");
        return result;
    }

}
