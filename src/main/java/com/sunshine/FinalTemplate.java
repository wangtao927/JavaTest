package com.sunshine;

/**
 * Created by wangtao on 2018/3/8.
 */
public class FinalTemplate {

    int i;
    final int j;
    static FinalTemplate obj;
    public FinalTemplate () {
        i = 1;
        j = 2;
    }

    public static void writer() {

        obj = new FinalTemplate();
    }

    public static void reader() {
        FinalTemplate tem = obj;
        int a = tem.i;
        int b = tem.j;
    }






}
