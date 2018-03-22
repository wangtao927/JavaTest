package com.sunshine.designpatterns.template;

/**
 * Created by wangtao on 2018/3/20.
 */
public class Alipay extends Pay {

    @Override
    String updateOrder() {
        System.out.println("alipay update order");
        return "alipay";
    }

    @Override
    String updateBalance() {
        System.out.println("alipay update balance");
        return "alipay balance";
    }
}
