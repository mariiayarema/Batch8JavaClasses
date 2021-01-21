package com.syntax.Practice;

import java.util.*;

public class Practice4 {
    //    Given a non-empty list of words, return the k most frequent elements.
//            Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
//    Output: ["the", "is", "sunny", "day"]
//    Explanation: "the", "is", "sunny" and "day" are the four most frequent words,
//    with the number of occurrence being 4, 3, 2 and 1 respectively.
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("the");
        list.add("day");
        list.add("is");
        list.add("sunny");
        list.add("the");
        list.add("the");
        list.add("the");
        list.add("sunny");
        list.add("is");
        list.add("sunny");
        list.add("is");
        list.add("sunny");
        list.add("sunny");
        list.add("Now");


        Map<String, Integer> map = new HashMap<>();

        for (String string : list
        ) {
            Integer integer = map.get(string);
            if (integer != null) {
                integer = integer + 1;
                map.put(string, integer);
            } else {
                map.put(string, 1);
            }
        }



        Map<Integer,String> map2=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1*Integer.compare(o1,o2);
            }
        });
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> mapEntry:entrySet
        ) {
            map2.put(mapEntry.getValue(),mapEntry.getKey());
        }
        Collection<String> values = map2.values();
        List<String> freqWord=new ArrayList<>();
        Object[] objects = values.toArray();
        freqWord.add(objects[objects.length-4].toString());
        freqWord.add(objects[objects.length-3].toString());
        freqWord.add(objects[objects.length-2].toString());
        freqWord.add(objects[objects.length-1].toString());
        System.out.println(freqWord);




 }
}
