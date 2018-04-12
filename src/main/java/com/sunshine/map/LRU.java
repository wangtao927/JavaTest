package com.sunshine.map;

import java.util.LinkedHashMap;

/**
 * Created by wangtao on 2018/4/8.
 */
public class LRU<K, V> {

    private LinkedHashMap<K, V> linkedHashMap;



    public LRU() {
        linkedHashMap = new LinkedHashMap<>();
    }

    public void put(K key, V value) {

        linkedHashMap.put(key, value);

    }


}
