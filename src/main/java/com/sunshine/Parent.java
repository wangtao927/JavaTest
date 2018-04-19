package com.sunshine;

/**
 * Created by wangtao on 2018/4/19.
 */
public class Parent {

    static {
        System.out.println("parent static");
    }

    public Parent() {

        System.out.println("parent construct");
    }
}
