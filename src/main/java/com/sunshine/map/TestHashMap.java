package com.sunshine.map;

import java.util.HashMap;

/**
 * Created by wangtao on 2018/3/13.
 */
public class TestHashMap {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put(null, "1");
        for (int i = 0; i < 10; i++) {
            hashMap.put("test" + i, i);
        }
        hashMap.put("11", "");
        hashMap.put("12", "");
        hashMap.put("13", "");
        hashMap.put(Integer.parseInt("1111", 2), "");
        hashMap.put(Integer.parseInt("0000000000000111", 2), "");
        hashMap.put(Integer.parseInt("0000000000000111", 2), "");

        System.out.println(Integer.parseInt("7fffffff", 16));

    }

}
