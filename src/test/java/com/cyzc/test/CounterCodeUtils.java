package com.cyzc.test;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import lombok.val;

public class CounterCodeUtils {

    private static final String COUNTER_PREFIX = "C";


    private static final String[] symbol = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "A", "B", "C", "D", "E", "F",
            "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y",
            "Z"};
    private static final Map<String, String> brandNameMap = ImmutableMap.<String, String>builder()
            .put("GAC", "GA")
            .put("BIO", "BO")
            .put("LAN", "LA")
            .put("AC", "AC")
            .put("KLS", "KS")
            .put("YS", "YS")
            .put("HR", "HR")
            .put("SHU", "SH")
            .put("SEPORA", "SP")
            .put("YSL", "YL")
            .build();

    public static String createGroupCode(String brandNameShort) {
        return createCounterCode(COUNTER_PREFIX, brandNameShort, getRandomString(5));
    }

    private static String createCounterCode(String prefix, String brandNameShort,
            String randomCode) {
        return prefix
                + brandNameMap.get(brandNameShort)
                + randomCode;
    }

    public static String getRandomString(int length) {
        // String str = "ABCDEFGHJKLMNPQRSTUVWXYZ0123456789";
        List<String> str = Arrays.asList(symbol);
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(34);
            sb.append(str.get(number));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String brandName = "KLS";

        for (int i = 0; i < 10; i++) {
            final val groupCode = CounterCodeUtils.createGroupCode(brandName);
            System.out.println(groupCode);
        }

    }
}
