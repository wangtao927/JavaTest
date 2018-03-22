package com.sunshine.designpatterns.template;

/**
 * Created by wangtao on 2018/3/20.
 */
public class Client {
    public static void main(String[] args) {
        Alipay alipay = new Alipay();
        alipay.pay();

        WechatPay wechatPay = new WechatPay();
        wechatPay.pay();
    }
}
