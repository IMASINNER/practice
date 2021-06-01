package pojo;

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

}