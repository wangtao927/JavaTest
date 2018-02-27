package com.sunshine.designpatterns.strategy;

import groovyjarjarantlr.PythonCharFormatter;

/**
 * Created by wangtao on 2018/2/22.
 */
public class Alipay implements Pay {
    @Override
    public boolean pay(double amount) {
        return false;
    }
}
