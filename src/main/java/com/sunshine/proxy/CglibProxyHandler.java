package com.sunshine.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by wangtao on 2018/1/23.
 */
public class CglibProxyHandler implements MethodInterceptor {

    public Object getProxy(Class clazz) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理中...");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib代理结束...");
        return result;
    }
}
