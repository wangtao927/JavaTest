package com.sunshine.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wangtao on 2018/3/23.
 */
public class MyObserver implements Observer {


    private String msg;

    public MyObserver() {
    }



    @Override
    public void update(Observable o, Object arg) {

        System.out.println("recive msg:" + arg);
    }


}
