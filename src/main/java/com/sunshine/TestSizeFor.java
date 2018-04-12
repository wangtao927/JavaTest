package com.sunshine;

/**
 * Created by wangtao on 2018/4/11.
 */
public class TestSizeFor {

    public static void main(String[] args) {
        int size = 100;
        int n = size - 1;
        // 100
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        int result =(n < 0) ? 1 : (n >= Integer.MAX_VALUE) ? Integer.MAX_VALUE : n + 1;
        System.out.println(result);
    }
}
