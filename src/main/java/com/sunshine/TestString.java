package com.sunshine;

/**
 * Created by wangtao on 2016/12/6.
 */
public class TestString {

    public static void main(String[] args) {
        String str = "yqbh:109012,;yqmc:电感测微仪,;zsbh:第1603-A0737CF0901号,;qhgg:DGB-5B,;clfw:,;yxrq:20170328,;jdrq:20160329,;bqdd:MPE:±0.10μm,;ccbh:111,;fdz:,;bqdd1:,;sid:1C31D693-BED4-45F8-AD81-41EF7EA8DD1F,;yqmcyw:Inductance Sensor,;lblb:1\n"
            + "yqbh:109013,;yqmc:立式光学计,;zsbh:第1603-A0737CF0897号,;qhgg:JDG-I,;clfw:,;yxrq:20170328,;jdrq:20160329,;bqdd:MPE:±0.25μm,;ccbh:700375,;fdz:,;bqdd1:,;sid:5D8FCA43-9DE0-43AD-9834-1CA8E92C41CF,;yqmcyw:Optical or vertical,;lblb:1\n"
            + "yqbh:109014,;yqmc:水平仪示值检定器,;zsbh:第1603-A0737CF0899号,;qhgg:101A,;clfw:,;yxrq:20170328,;jdrq:20160329,;bqdd:MPE;±5%,;ccbh:85369,;fdz:,;bqdd1:,;sid:EA26199A-7AE2-461C-850B-0C6589F1C6A6,;yqmcyw:Level Indication Calibrator,;lblb:1";


        String[] s = str.split("\\n");
        for (String s1 : s) {
            if (s1.contains(",;lblb:1")) {
                 String[] arr = s1.split(",;");
                System.out.println(arr[0].split(":")[1] + "《" + arr[1].split(":")[1] +"》");

            } else if (s1.contains(",;lblb:0")) {

                String[] arr = s1.split(",;");
                System.out.println(arr[0].split(":")[1] + "《" + arr[1].split(":")[1] +"》");
            }
//            System.out.println(s1);
        }
    }
}
