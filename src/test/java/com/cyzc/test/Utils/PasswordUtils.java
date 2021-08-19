package com.cyzc.test.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Cyzc
 * @description
 * @since 2021-08-04
 */
public class PasswordUtils {

    private static final String[] symbol = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i",
            "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A",
            "B", "C", "D", "E", "F",
            "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y",
            "Z","1","2","3","4","5","6","7","8","9"};


    public static String getRandomString(int length) {

        List<String> str = Arrays.asList(symbol);
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(58);
            sb.append(str.get(number));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(getRandomString(12));

    }

}
