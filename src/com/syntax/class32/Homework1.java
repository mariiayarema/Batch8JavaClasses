package com.syntax.class32;

import java.util.*;

public class Homework1 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);
        Set<String> removeDuplicate=new HashSet<>(aList);
        System.out.println(removeDuplicate);
        //aList.clear();
        //aList.addAll(set);
        aList=new ArrayList<>(removeDuplicate);
        System.out.println(aList);
    }
}
