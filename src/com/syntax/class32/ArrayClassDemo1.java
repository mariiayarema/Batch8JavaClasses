package com.syntax.class32;

import java.util.ArrayList;

public class ArrayClassDemo1 {
    public static void main(String[] args) {
        ArrayList <Double> doubleArrayList=new ArrayList <>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(15.00);
        System.out.println("Before replacement");
        System.out.println(doubleArrayList);
        doubleArrayList.set(1,20.25);//will replace value at index 1 for 20.25
        //set(index, value you want to replace with)
        System.out.println("After replacement");
        System.out.println(doubleArrayList);
        doubleArrayList.remove(0);//will remove element with index 0
        System.out.println("After removal  value at index 0");
        System.out.println(doubleArrayList);
        System.out.println("Printing from top to bottom");
        for (Double singleNum:doubleArrayList) {
            System.out.println(singleNum);
        }
        System.out.println("----------------------------");
        System.out.println("Lopping in reverce order");
        for (int i = doubleArrayList.size()-1; i>=0 ; i--) {
            System.out.println(doubleArrayList.get(i));
        }

        System.out.println("----------iterator interface let us iterate through collection-----------");
        System.out.println("It has 3 methods hasNext()-checks if threre are any element left in collection");
        System.out.println("next()-will return me next element in collection");
    }
}
