package com.sunshine.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by wangtao on 2018/4/8.
 */
public class LRU<K, V> extends LinkedHashMap<K, V> {

    private final int maxSize;

    public LRU(int maxSize) {
        this(maxSize, 16, 0.75f, false);
    }

    public LRU(int maxSize, int initialCapacity, float loadFactory, boolean accessOrder) {
         super(16, 0.75f, accessOrder);
         this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }

    public static void main(String[] args) {
        LRU<String, String> lru = new LRU<String, String>(10);
        for (int i = 0; i < 20; i++) {
            lru.put(i + "", "i");
            System.out.println(lru);
        }
        
    }
}
