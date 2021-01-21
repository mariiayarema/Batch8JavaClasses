package com.syntax.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);
        doubleArrayList.add(180.00);
        doubleArrayList.add(190.00);


        Iterator<Double> iterator = doubleArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(iterator.next());
        }
        //We will get an error cause we shouldnot use next() twice
    }
}
