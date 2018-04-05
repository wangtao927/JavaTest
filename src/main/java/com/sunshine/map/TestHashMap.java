package com.sunshine.map;

import java.util.HashMap;

/**
 * Created by wangtao on 2018/3/13.
 */
public class TestHashMap {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put("1", "");
        hashMap.put("2", "");
        for (int i = 0; i < 15; i++) {
            hashMap.put("test"+i, i);
        }
        hashMap.put(Integer.parseInt("1111", 2), "");
        hashMap.put(Integer.parseInt("0000000000000111", 2), "");
        hashMap.put(Integer.parseInt("0000000000000111", 2), "");

        System.out.println(Integer.parseInt("7fffffff", 16));

    }

}
