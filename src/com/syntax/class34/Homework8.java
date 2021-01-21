package com.syntax.class34;

import java.util.ArrayList;

public class Homework8 {
    public static void main(String[] args) {
//        Create a collection of integers in which you can keep duplicates.
//                Write a logic to find sum of all integers

        ArrayList <Integer> numbers=new ArrayList<>();
        numbers.add(34);
        numbers.add(55);
        numbers.add(7);
        numbers.add(23);
        numbers.add(34);
        numbers.add(34);

        int sum=0;
        for (Integer num:numbers) {
            sum+=num;
        }
        System.out.println("Sum of all integers is "+sum);
    }
}
