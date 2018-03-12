package com.sunshine.thread;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wangtao on 2018/3/8.
 */
public class TestConcurrentHashMap {
    ConcurrentHashMap hashMap = new ConcurrentHashMap();

    private void putValus(String key, String value) {
         hashMap.put(key, value);
    }

    public void batchPut() {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    putValus(RandomStringUtils.random(10), "1");
                }
            }).start();
        }
    }
    public static void main(String[] args)
        throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException {
//        ConcurrentHashMap hashMap = new ConcurrentHashMap();
//         hashMap.put("1", "1");
//        System.out.println(spread("15".hashCode()) + "__" + spread0("15".hashCode()));
//        System.out.println(spread("16".hashCode()) + "__" + spread0("16".hashCode()));
//        System.out.println(spread("17".hashCode()) + "__" + spread0("17".hashCode()));
//        System.out.println(spread("18".hashCode()) + "__" + spread0("18".hashCode()));
         new TestConcurrentHashMap().putValus("1", "1");
//        Class clazz = Class.forName("java.util.concurrent.ConcurrentHashMap");
//        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) clazz.newInstance();
//        concurrentHashMap.put("11", "11");
//        for (Method method : clazz.getMethods()) {
//            if(method.getName().equals("spread")) {
//                System.out.println("-----------------");
//
//                System.out.println( method.invoke(method,1));
//            } else {
//                System.out.println(method.getName());
//            }
//        }
//
//        System.out.println(concurrentHashMap.get("11"));
    }

    static final int HASH_BITS = 0x7fffffff; // usable bits of normal node hash

    static int spread(int h) {
        return (h ^ (h >>> 16)) & HASH_BITS;
    }
    static int spread0(int h) {
        return (h ^ (h >>> 16));
    }
}
