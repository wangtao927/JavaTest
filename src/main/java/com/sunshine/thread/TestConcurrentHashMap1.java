package com.sunshine.thread;

import org.apache.commons.lang.RandomStringUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wangtao on 2018/3/8.
 */
public class TestConcurrentHashMap1 {


    public static void main(String[] args) {
        ConcurrentHashMap hashMap = new ConcurrentHashMap();

        for (int i = 0; i < 15; i++) {
            hashMap.put("test" + i, i);

        }
        hashMap.put("1", "1");
        System.out.println(hashMap.size());
    }


}
