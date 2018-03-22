package com.sunshine.designpatterns.template;

/**
 * Created by wangtao on 2018/3/20.
 */
public class WechatPay extends Pay {


    @Override
    String updateOrder() {
        System.out.println("wechat update order");
        return "wechat";
    }

    @Override
    String updateBalance() {
        System.out.println("wechat update balance");
        return "wechat balance";
    }
}
