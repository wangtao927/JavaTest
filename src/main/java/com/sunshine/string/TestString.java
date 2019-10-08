package com.sunshine.string;

/**
 * Created by wangtao on 2018/4/16.
 */
public class TestString {

    public static void main(String[] args) {

        String str1 = "1";
        String str2 = new String("1");
        String str3 = str1.intern();
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1== str3);

    }
}
