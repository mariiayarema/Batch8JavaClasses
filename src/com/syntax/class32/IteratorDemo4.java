package com.syntax.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo4 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Tampa");
        cities.add("Las Vegas");
        cities.add("Kabul");
        cities.add("Monrovia");
        cities.add("Brooklyn");
        cities.add("New York");
        cities.add("San Diego");
        System.out.println(cities);
// cities.removeIf(s->s endWith("a"));
        Iterator <String> iterator=cities.iterator();
        while(iterator.hasNext()){
            if(iterator.next().endsWith("a")){
                iterator.remove();
            }
        }
    }
}
