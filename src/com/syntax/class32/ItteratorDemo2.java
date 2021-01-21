package com.syntax.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class ItteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);
        Iterator<Double> iterator=doubleArrayList.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
       // System.out.println(iterator.next());//WILL GIVE AN EROOR
        //NO SUCH ELEMENT cause we are at the last index
    }
}
