package com.syntax.class32;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Homework5 {
    public static void main(String[] args) {
        Set<String> city=new LinkedHashSet<>();
        city.add("Amsterdam");
        city.add("London");
        city.add("New York");
        city.add("Ankara");
        city.add("Madrid");
        city.add("Berlin");
        city.add("Istanbul");
        System.out.println("Before removal "+city);
        Iterator <String> iterator=city.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println("After removing city that starts from A - "+city);
    }
}
