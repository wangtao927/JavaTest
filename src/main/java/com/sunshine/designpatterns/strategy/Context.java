package com.sunshine.designpatterns.strategy;

/**
 * Created by wangtao on 2018/2/22.
 */
public class Context {

    Pay pay;

    public Pay getPay() {
        return pay;
    }

    public void setPay(Pay pay) {
        this.pay = pay;
    }

    boolean actualPay(double amount) {
        return pay.pay(amount);
    }
}
