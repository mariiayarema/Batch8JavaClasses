package com.syntax.class34;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Homework5 {
    public static void main(String[] args) {
//        Create a Map from array of cities that will sort keys in alphabetical order.
//        As a key store the name of the city and as a value store the length of the city
//       (Example: Paris=5, Moscow =6, Washington DC=13 etc..).
//        If any city name is more than 7 characters remove that city .

        String [] cities={"London","Kiev","Miami","New York", "Milan", "Amsterdam"};

        TreeMap<String,Integer> citiesMap=new TreeMap<>();

        for (int i = 0; i <cities.length ; i++) {
            citiesMap.put(cities[i],cities[i].length());
        }

        Iterator<Map.Entry<String,Integer>> iterator=citiesMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> next=iterator.next();
           int cityLength= next.getValue();
           if(cityLength>7){
               iterator.remove();
           }
        }
        System.out.println(citiesMap);


    }
}
