package com.facishare.test.map;

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


        int[] arr = {0,1,2,3,4,5,6};
        int[] dest = new int[3];
        System.arraycopy(arr,0, arr, 3, 1);
        System.out.println(Arrays.toString(arr));
    }
}
