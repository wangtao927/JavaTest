package com.sunshine.designpatterns.template;

/**
 * Created by wangtao on 2018/2/6.
 */
public abstract class Pay {

    String createOrder(){return null;}

    String pay() {
        createOrder();
        updateBalance();
        updateOrder();
        return "success";
    }

    String updateOrder(){return null;}


    String updateBalance() {
        return null;
    }

}
