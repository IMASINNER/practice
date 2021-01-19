package Collection;

import org.junit.Test;
import org.springframework.util.ObjectUtils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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



}
