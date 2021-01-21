package com.syntax.class32;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HasSetDemo3 {
    public static void main(String[] args) {


    Set<String> treeSet=new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Kiwi");
        treeSet.add("Apple");
        treeSet.add("Strawberry");
        treeSet.add("avocado");
        treeSet.add("olives");
        System.out.println(treeSet);
 }
}
