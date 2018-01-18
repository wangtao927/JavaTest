package com.sunshine.bd;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by wangtao on 2017/3/6.
 */
public class TestBigDecimal {

    public static void main(String[] args) {

        BigInteger num = new BigInteger("0");
        num = num.setBit(1);
        System.out.println(num);
        num = num.setBit(2); System.out.println(num);
        num = num.setBit(4); System.out.println(num);
        num = num.setBit(5); System.out.println(num);
        num = num.setBit(6); System.out.println(num);
        num = num.setBit(7); System.out.println(num);

        System.out.println(num.testBit(1));
        System.out.println(num.testBit(2));
        System.out.println(num.testBit(3));
        System.out.println(num.testBit(4));
        System.out.println(num.testBit(5));
        System.out.println(num.testBit(6));
        System.out.println(num.testBit(7));
        System.out.println(num.testBit(8));


    }
}
