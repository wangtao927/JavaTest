package com.facishare.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created by wangtao on 2016/9/30.
 */
public class CmdTest {

    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        Process p = rt.exec(new String[]{"ipconfig /all", "dir", "ipconfig"});

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), Charset.forName("GBK")));
        while (br.readLine() != null) {
            System.out.println(new String(br.readLine()));
        }

         if(p != null) {
            p.destroy();
        }


    }
}
