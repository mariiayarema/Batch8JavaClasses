package com.syntax.class31;

import java.util.ArrayList;
import java.util.List;

public class ArraysDemo2 {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
       arrayList.add(10);
       arrayList.add(100);
       arrayList.add(105);
       arrayList.add(102);

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains(100));
        arrayList.remove(3);
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        arrayList.remove(new Integer(100));
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        arrayList.clear();
        System.out.println(arrayList);
    }
}
