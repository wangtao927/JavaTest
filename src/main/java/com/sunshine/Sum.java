package com.sunshine;

/**
 * Created by wangtao on 2017/3/1.
 */
public class Sum {

    public int sum(int first, int second) {
        return first + second;
    }

    public int muti(int first, int second) {
        return first * second;
    }


    public static void main(String[] args) {

        retry:
        for (int i = 0; i < 10; i++) {

            System.out.println("t_" + i);
            if( i == 5) {
                break ;
            }
            System.out.println(i);
        }

    }


}
