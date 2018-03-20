package com.sunshine.designpatterns.proxy;

/**
 * 静态代理
 * Created by wangtao on 2018/3/20.
 */
public class StaticProxy {

    private Subject subject;

    public StaticProxy(Subject subject) {
        this.subject = subject;
    }

    public String getSubject() {
        System.out.println("before getsubject ");
        String result = subject.getSubject("xxx");
        System.out.println("after getsubject");
        return result;
    }
}
