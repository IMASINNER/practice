package com.cyzc.test.Collection;

import cn.hutool.core.collection.CollectionUtil;
import com.cyzc.test.pojo.Person;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.Test;
import org.springframework.util.ObjectUtils;
import org.testng.collections.Lists;

public class ListDemo {

    @Test
    public void testForeach() {
        List<String> list = new ArrayList<>();

        list.add("sdadsa");
        list.add("asdas");
        list.add("sdadssssa");
        list.add("sdaaaadsa");
        list.add("sdafgfgdsa");

        list.stream().forEach(System.out::println);

    }

    @Test
    public void testArrayLisrInit() {

        List list = new ArrayList(2 ^ 31);

        System.out.println(list);

    }


    @Test
    public void testJsonArray() {
        List<String> s = new ArrayList<>();

        s.add("asdasd");
        s.add("asdasgg");
        s.add("dfsdg");

    }

    @Test
    public void testUUID() {

        //List<String> L =new ArrayList();
        for (int i = 0; i < 10; i++) {
            String s = UUID.randomUUID().toString();
            System.out.println(s);
        }
    }

    @Test
    public void testNull() {
        List<String> s = new ArrayList<>();

        // s.add("");

        System.out.println(ObjectUtils.isEmpty(s.get(0)));

    }

    @Test
    public void getDate() {
        long timestamp = System.currentTimeMillis();
        // oneOffset.ofHours(0) 获取那个时区
        LocalDate localDate = Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.ofHours(0))
                .toLocalDate();
        System.out.println(localDate);
        LocalDateTime localDateTime = Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.ofHours(0))
                .toLocalDateTime();
        System.out.println(localDateTime);
    }

    @Test
    public void getDate1() {

        long timestamp = System.currentTimeMillis();
        LocalDate localDate = Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.ofHours(0))
                .toLocalDate();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        String result = localDate.format(fmt);

        System.out.println(result);
    }

    @Test
    public void TestBigDecimal() {

        // BigDecimal bigDecimal=new BigDecimal();

    }

    @Test
    public void testStreamFilter() {
        Person person1 = new Person("1", 1, "1");
        Person person2 = new Person("2", 2, "2");
        Person person3 = new Person("3", 1, "3");
        Person person4 = new Person("4", 4, "5");
        Person person5 = new Person("6", 6, "6");

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        List<Person> collect = list.stream().filter(person -> person.getAge().equals(1))
                .collect(Collectors.toList());

        System.out.println(collect);
    }

    @Test
    public void testasdas() {

        List<String> list = Arrays.asList("1", "2");

        list = Arrays.asList("3", "4");

        System.out.println(list);

    }

    @Test
    public void testNullList() {

        List<String> list = new ArrayList<>();
        list.add(null);
        final String s = list.get(0);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(s);
        System.out.println(null == s);

    }

    @Test
    public void testIntMax() {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;

        System.out.println(x + y);
    }

    @Test
    public void testSubString() {

        String s = "济南伊势丹";

        System.out.println(s.substring(0, 5));

    }

    @Test
    public void testConvertDate() {
        String s = "2020-10-27";
        SimpleDateFormat SDF_19 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final String s1 = date2TimeStamp(s, "yyyy-MM-dd");
        System.out.println(Long.parseLong(s1));
        System.out.println(Long.valueOf(s1));

        System.out.println(s1);

    }

    /**
     * 日期格式字符串转换成时间戳
     *
     * @param date_str 字符串日期
     * @param format   如：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String date2TimeStamp(String date_str, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return String.valueOf(sdf.parse(date_str).getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @Test
    public void test2222() {

        final List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        final List<Integer> integers1 = Arrays.asList(4, 5, 6, 7, 8, 9);

        List<Integer> strings = integers.stream()
                .filter(integers1::contains)
                .collect(Collectors.toList());

        System.out.println(strings);
    }

    @Test
    public void test3333() {

        List list = new ArrayList();

        final List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        final List<Integer> integers1 = Arrays.asList(10, 0, 6, 7, 8, 9);

        List<Integer> strings = integers.stream()
                .filter(integers1::contains)
                .collect(Collectors.toList());

        list.addAll(strings);
        System.out.println(strings);
        System.out.println(strings);
    }

    @Test
    public void test21232() {

        String s = null;

        final List<String> strings = Splitter.on(",").trimResults().splitToList(s);

        List<Integer> ss = new ArrayList<>();

        strings.forEach(item -> ss.add(Integer.valueOf(item))
        );

        System.out.println(strings);
        System.out.println(ss);
    }

    @Test
    public void test212322() {

        List<String> aa = null;

        final String join = Joiner.on(",").join(aa);

        System.out.println(join);

    }


    @Test
    public void test2123222() {

        final List<Integer> strings = Lists.newArrayList(1, 2, 3, 4);

        List<Integer> ss = new ArrayList<>();

        strings.forEach(item -> {
            if (item == 2) {
                return;
            }
            item = item + 1;
            ss.add(item);
        });

        System.out.println(strings);
        System.out.println(ss);

    }

    @Test
    public void test212322233() {

        List<String> l = new ArrayList();
        String s = null;
        l.add(s);

        Iterables.removeIf(l, Objects::isNull);
        System.out.println(ObjectUtils.isEmpty(l));
        System.out.println(l.size());
        System.out.println(CollectionUtil.isEmpty(l));

    }

    public static void main(String[] args) {
        System.out.println("\u4f18\u79c0");
    }

}
