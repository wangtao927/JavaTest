package com.sunshine.designpatterns.observer;

/**
 * Created by wangtao on 2018/3/23.
 */
public class MyClient {

    public static void main(String[] args) {

        MyObserver observer1 = new MyObserver();
        MyObserver observer2 = new MyObserver();
        MyObserver observer3 = new MyObserver();

        MyObservable observable = new MyObservable();
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        observable.getNewMsg("call all1");

        observable.deleteObserver(observer1);
        observable.getNewMsg("call all2 ");



    }
}
