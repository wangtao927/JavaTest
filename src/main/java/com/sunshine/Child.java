package com.sunshine;

/**
 * Created by wangtao on 2018/4/19.
 */
public class Child extends Parent {


    static {
        System.out.println("child static");
    }
    public Child() {

        System.out.println("child construct");

    }

    public static void main(String[] args) {
       Child child =  new Child();

       new Child();
    }
}
