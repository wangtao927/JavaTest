package com.sunshine.designpatterns.strategy;

/**
 * Created by wangtao on 2018/2/22.
 */
public class Client {

    public static void main(String[] args) {
        Alipay alipay = new Alipay();

        Context context = new Context();
        context.setPay(alipay);
        context.actualPay(100d);

    }
}
