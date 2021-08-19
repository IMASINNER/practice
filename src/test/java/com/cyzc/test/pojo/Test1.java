package com.cyzc.test.pojo;

import com.google.common.base.Joiner;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-06-15
 */

public class Test1 {

    @Test
    public  void sss() {
        Long a=1235001600000L;
        System.out.println(Long.valueOf(a));
        System.out.println(a.hashCode());
        Long b=1235001600000L;
        System.out.println(Long.valueOf(b));
        System.out.println(Long.hashCode(b));
        System.out.println(a==b);
        System.out.println(a.equals(b));

        Long c=100L;
        System.out.println(c.hashCode());
        Long d=100L;
        System.out.println(d.hashCode());

        System.out.println(c==d);
    }

    @Test
    public void testJoin(){
      /*  List<String> list= Arrays.asList("1","2","3");

        final String join = Joiner.on("/").join(list);
        System.out.println(join);
*/

        List list=new ArrayList();

        list.add(11);
        list.add("123213412");
        final String join = Joiner.on("/").join(list);
        System.out.println(join);

    }

    @Test
    public void testGuavaCache(){
      /*  List<String> list= Arrays.asList("1","2","3");

        final String join = Joiner.on("/").join(list);
        System.out.println(join);
*/

        Cache<String,String> cache= CacheBuilder.newBuilder().build();
        cache.put("1","1");
        System.out.println(cache.getIfPresent("1"));

    }

 /*   @Test
    public void testEncode(){

        String s=new


    }*/
}