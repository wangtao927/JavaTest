package com.sunshine.datatype;

import javax.tools.ToolProvider;

/**
 *  int 4个字节(32bit) -2,147,483,648到2,147,483,647 默认为0
    short 2个字节(16bit) -32,768到32,767  默认为0
    long 8个字节(64bit) -9,223,372,036,854,775,808L到9,223,372,036,854,775,807L  默认为0L
    byte 1个字节(8bit) -128到127  默认为0
    float 4个字节(32bit) 约+—3.40282347E+38F（6~7个有效的十进制数位） 默认为0.0F
    double 8个字节(64bit) 约+-1.79769313486231570E+308（15个有效数位）  默认为0.0D
 * Created by wangtao on 2018/3/21.
 */
public class BaseDataType {
    // 8种基础数据类型

    public static void main(String[] args) {

        // 字节大小
        byte b = 1; // min   -128  max 127  (2^8-1)
        System.out.println("");
        System.out.println("byte  : min=" + Byte.MIN_VALUE  + " max=" + Byte.MAX_VALUE + " 占用字节: 1 " );
        short s = 1; // min -32768   max 32767 2^16 -1
        System.out.println("Short : min=" + Short.MIN_VALUE + " max=" + Short.MAX_VALUE + " 占用字节: 2");
        int i = 1;
        System.out.println("Integer : min=" + Integer.MIN_VALUE + " max=" + Integer.MAX_VALUE + " 占用字节: 4");

        long l = 1;
        System.out.println("Long : min=" + Long.MIN_VALUE + " max=" + Long.MAX_VALUE + " 占用字节: 8");

        char c = 'c';

        boolean b1 = false;

        float f = 1;
        System.out.println("Float : min=" + Float.MIN_VALUE + " max=" + Float.MAX_VALUE + " 占用字节: 4");

        double d = 1;
        System.out.println("Double : min=" + Double.MIN_VALUE + " max=" + Double.MAX_VALUE + " 占用字节: 8");

    }

}
