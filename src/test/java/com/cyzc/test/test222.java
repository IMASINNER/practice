package com.cyzc.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.junit.Test;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-08-03
 */
public class test222 {

    @Test
    public void test11(){

        double d=300d;
        double C=13d;

        final double division = test222.division(d, C, 2);
        DecimalFormat df = new DecimalFormat("#,#0.00#");
        System.out.println(df.format(division));
    }



    public static double division(double value1, double value2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(value1);
        BigDecimal b2 = new BigDecimal(value2);

        return b1.divide(b2, scale, RoundingMode.HALF_UP).doubleValue();
    }

    @Test
    public void test222(){

        String s="A";
        String v=s+1;
        System.out.println(v);

    }

    @Test
    public void test22233(){
        int ascii = 65;
        char ch1 = (char)ascii;
        System.out.println(convertLightPosition(69));
        System.out.println(convertLightPosition(69));
    }
    String convertLightPosition(int i){

        char ch1 = (char)i;
        return String.valueOf(ch1);

    }

}