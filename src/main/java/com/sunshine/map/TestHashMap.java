package com.sunshine.map;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by wangtao on 2018/3/13.
 */
public class TestHashMap {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put("1", "");
        hashMap.put("2", "");
        hashMap.put(Integer.parseInt("1111", 10), "");
        hashMap.put(Integer.parseInt("0111", 10), "");
    }

}
