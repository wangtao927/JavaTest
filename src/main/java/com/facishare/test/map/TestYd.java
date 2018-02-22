package com.facishare.test.map;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

import java.util.Arrays;

/**
 * Created by wangtao on 2018/2/2.
 */
public class TestYd {

    public static void main(String[] args) {

//        System.out.println(1 << 1);
//        System.out.println(8 >> 1);
//        System.out.println(1 << 30);
//        System.out.println(Integer.MAX_VALUE);


//        int[] arr = {0,1,2,3,4,5,6};
//        int[] dest = new int[3];
//        System.arraycopy(arr,0, arr, 3, 1);
//        System.out.println(Arrays.toString(arr));

        //  hashMap的hash算法
        Object key;
        int h;
        for (int i = 0; i < 100 ; i++) {
            key = RandomStringUtils.random(4);
            System.out.println((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16));
        }
    }

    int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
