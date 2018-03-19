package com.sunshine.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangtao on 2018/3/13.
 */
public class TestHashMap {


    @Test
    public void testHashMapLoop() {

//        ExecutorService executorService = Executors.newWorkStealingPool(100);
        HashMap hashMap = new HashMap();
//        for (int i = 0; i < 1000; i++) {
//
//            executorService.execute(new Runnable() {
//                @Override
//                public void run() {
//                    hashMap.put(UUID.randomUUID(), "");
//                }
//            });
//        }
        hashMap.put(UUID.randomUUID(), "");
        hashMap.put(UUID.randomUUID(), "");

        //executorService.shutdown();

    }
}
