package com.syntax.class34;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Homework2 {
    public static void main(String[] args) {
//
//        Create a map of countries with its capital that will store countries in alphabetical order.
//        Print all keys and values from a country map using for each loop and iterator.
//        Print all values from a country map using for each loop and iterator.

        TreeMap <String,String> countries=new TreeMap<>();
        countries.put("Ukraine","Kiev");
        countries.put("USA","Washington DC");
        countries.put("Turkey","Ankara");
        countries.put("Belarus","Minsk");
        countries.put("Pakistan","Islamabad");

        Set<Map.Entry<String,String>> set=countries.entrySet();
        for (Map.Entry<String,String> countryAndCapital: set) {
            System.out.println(countryAndCapital);
        }


        System.out.println("-------------------------");
        Iterator<Map.Entry<String,String>> iterator=countries.entrySet().iterator();
        while(iterator.hasNext()){
           Map.Entry<String,String> next=iterator.next();
            System.out.println(next);
        }

        System.out.println("-----------------------------");

        Set <String> keys=countries.keySet();

        for (String key:keys) {
            System.out.println(countries.get(key));
        }

        System.out.println("--------------------------------");

        Iterator <String> iterator1=countries.keySet().iterator();
        while(iterator1.hasNext()){
            String next1=iterator1.next();
            System.out.println(countries.get(next1));
        }

        }

    }

