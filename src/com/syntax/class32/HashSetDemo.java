package com.syntax.class32;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hasSet=new HashSet<>();
        Set<String> linkedHashSet=new LinkedHashSet<>();
        Set<String> treeSet=new TreeSet<>();
        hasSet.add("Apple");
        hasSet.add("Mango");
        hasSet.add("Kiwi");
        hasSet.add("Apple");
        hasSet.add("Strawberry");
        hasSet.add("avocado");
        hasSet.add("olives");
        System.out.println(hasSet);
    }
}
