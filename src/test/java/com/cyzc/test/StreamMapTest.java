package com.cyzc.test;

import com.cyzc.test.pojo.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapTest {


    public static void main(String[] args) {

        Person p1=new Person("p1",1,"男");
        Person p2=new Person("p2",2,"男");
        Person p3=new Person("p3",3,"女");
        Person p4=new Person("p4",4,"男");
        Person p5=new Person("p5",5,"男");

        List<Person> list=new ArrayList<>();

        list.add(p5);
        list.add(p4);
        list.add(p3);
        list.add(p2);
        list.add(p1);


        Map<String, String> map=list.stream().collect(Collectors.toMap(Person::getName,Person::getSex));

        System.out.println(map);
    }


}
