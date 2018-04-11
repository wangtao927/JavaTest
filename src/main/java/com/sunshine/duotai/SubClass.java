package com.sunshine.duotai;

public class SubClass extends ParentClass {

    public static void method2() {
        System.out.println("method2");
    }

    private String method1() {
        return "1";
    }


    public static void main(String[] args) {

        new SubClass().method1();

        SubClass.method2();
    }
}
