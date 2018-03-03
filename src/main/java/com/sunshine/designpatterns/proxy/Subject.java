package com.sunshine.designpatterns.proxy;

/**
 * Created by wangtao on 2018/1/30.
 */
public class Subject implements ISubject {
    @Override
    public String getSubject(String realName) {
        System.out.println("receive realName:" + realName);
        return realName;
    }
}
