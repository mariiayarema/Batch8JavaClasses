package com.syntax.class31;

import java.util.ArrayList;

public class ArrayListContains {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList=new ArrayList <> ();
        stringArrayList.add("Danilo");
        stringArrayList.add("Asghar");
        stringArrayList.add("Burju");
        stringArrayList.add("Eduard");
        stringArrayList.add("Daria");
        stringArrayList.add("Davit");
        stringArrayList.add("Ali");
        stringArrayList.add("Mike");
        stringArrayList.add("Vlad");
        stringArrayList.add("Anastasiia");

        ArrayList<String> stringArrayList2=new ArrayList <> ();
        stringArrayList2.add("Davit");
        stringArrayList2.add("Ali");
        stringArrayList2.add("Mike");
        stringArrayList2.add("Vlad");
        stringArrayList2.add("Anastasiia");
        System.out.println(stringArrayList.containsAll(stringArrayList2));
    }
}
