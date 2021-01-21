package com.syntax.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);
        doubleArrayList.add(180.00);
        doubleArrayList.add(190.00);
        doubleArrayList.add(150.00);
       

        Iterator<Double> iterator=doubleArrayList.iterator();

        System.out.println("before removal");
        System.out.println(doubleArrayList);

        while(iterator.hasNext()){
            if(iterator.next()<20)
            iterator.remove();
        }
        System.out.println("After removing");
        System.out.println(doubleArrayList);

        Iterator <Double> i=doubleArrayList.iterator();

        System.out.println(iterator.next());
    }
}
