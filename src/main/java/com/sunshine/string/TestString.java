package com.sunshine.string;

/**
 * Created by wangtao on 2018/4/16.
 */
public class TestString {

    public static void main(String[] args) {

        String str = "1";
        String str1 = "1";
        String str3 = new String("1");
        System.out.println(str == str1);
        System.out.println(str == str3);
        System.out.println(str3.intern() == str);

    }
}
