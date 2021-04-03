package Collection;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.Test;
import org.springframework.util.ObjectUtils;
import pojo.Person;

public class ListDemo {

    @Test
    public void testForeach(){
        List<String> list=new ArrayList<>();

        list.add("sdadsa");
        list.add("asdas");
        list.add("sdadssssa");
        list.add("sdaaaadsa");
        list.add("sdafgfgdsa");


        list.stream().forEach(System.out::println);

    }

    @Test
    public void testArrayLisrInit(){

        List list=new ArrayList(2^31);

        System.out.println(list);

    }


    @Test
    public void testJsonArray(){
        List<String> s=new ArrayList<>();

        s.add("asdasd");
        s.add("asdasgg");
        s.add("dfsdg");

    }

    @Test
    public void testUUID(){

        //List<String> L =new ArrayList();
        for (int i = 0; i <10 ; i++) {
            String s= UUID.randomUUID().toString();
            System.out.println(s);
        }
    }

    @Test
    public void testNull(){
        List<String> s=new ArrayList<>();

      // s.add("");


        System.out.println(ObjectUtils.isEmpty(s.get(0)));

    }

    @Test
    public  void  getDate(){
        long timestamp = System.currentTimeMillis();
        // oneOffset.ofHours(0) 获取那个时区
        LocalDate localDate = Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.ofHours(0)).toLocalDate();
        System.out.println(localDate);
        LocalDateTime localDateTime = Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.ofHours(0)).toLocalDateTime();
        System.out.println(localDateTime);
    }

    @Test
    public  void getDate1(){

        long timestamp =System.currentTimeMillis();
        LocalDate localDate = Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.ofHours(0)).toLocalDate();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        String result=localDate.format(fmt);

        System.out.println(result);
    }

    @Test
    public void TestBigDecimal(){

       // BigDecimal bigDecimal=new BigDecimal();



    }
    @Test
    public void testStreamFilter(){
        Person person1=new Person("1",1,"1");
        Person person2=new Person("2",2,"2");
        Person person3=new Person("3",1,"3");
        Person person4=new Person("4",4,"5");
        Person person5=new Person("6",6,"6");

        List<Person> list=new ArrayList<>();
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
    public void testasdas(){


        List<String> list= Arrays.asList("1","2");

        list=Arrays.asList("3","4");

        System.out.println(list);

    }


}
