package com.sunshine.testfinal;

/**
 * Created by wangtao on 2018/4/2.
 */
public class TestFinally {


    public void test1() {

        try {
            String result =  test2() ;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    private String test2() {
        try {
            System.out.println("test2");
            throw new RuntimeException("test2 exception");
        } finally {
            return "return test2----";
        }
    }

    public static void main(String[] args) {
        TestFinally testFinally = new TestFinally();
        testFinally.test1();
    }
}
