package com.cyzc.test.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-05-12
 */
public class StringUtils {

    @Test
    public void testString() {

        final List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "11", "12", "13", "14"
        );

        List<String> result = new ArrayList<>();

        String db = "1-3,6,11-13";

        final String[] split = db.split(",");

        for (String s : split) {
            if (s.contains("-")) {
                final String[] split1 = s.split("-");
                String startIndex = split1[0];
                String endIndex = split1[1];

                final List<String> list1 = list
                        .subList(Integer.parseInt(startIndex) - 1, Integer.parseInt(endIndex));
                result.addAll(list1);

            } else {
                final String s1 = list.get(Integer.parseInt(s) - 1);
                result.add(s1);
            }
        }

        System.out.println(result);


    }
    public static double division(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));

        System.out.println(b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
    }

    public static void main(String[] args) {

        final double division = StringUtils.division(300, 200, 2);

        System.out.println(division);

    }
}