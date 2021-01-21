package com.syntax.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Homework4Test {
    public static void main(String[] args) {
        Person person1=new Person("Oleh","Bogdan",34,50.000);
        Person person2=new Person("Ievgenii","Markadanov",29,500.000);
        Person person3=new Person("Viktor","Hnativ",26,100.000);
        Person person4=new Person("Yan","Komarov",44,200.000);

        LinkedHashMap<Integer,Person> employee=new LinkedHashMap <>();

        employee.put(211,person1);
        employee.put(222,person2);
        employee.put(233,person3);
        employee.put(244,person4);

        Iterator<Map.Entry<Integer,Person>> iterator=employee.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Person> next=iterator.next();
         Person personValue=next.getValue();
         personValue.getUserDetails();
        }

    }
}
