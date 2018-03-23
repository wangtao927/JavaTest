package com.sunshine.designpatterns.observer;

import java.util.Observable;

/**
 * Created by wangtao on 2018/3/23.
 */
public class MyObservable extends Observable {

    public void getNewMsg(String msg) {
           this.setChanged();
           this.notifyObservers(msg);
    }
}
