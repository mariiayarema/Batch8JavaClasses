package com.syntax.class32;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HasSetDemo2 {
    public static void main(String[] args) {

            Set<String> LinkedHashSet=new LinkedHashSet<>();
            LinkedHashSet.add("Apple");
        LinkedHashSet.add("Mango");
        LinkedHashSet.add("Kiwi");
        LinkedHashSet.add("Apple");
        LinkedHashSet.add("Strawberry");
        LinkedHashSet.add("avocado");
        LinkedHashSet.add("olives");
        System.out.println( LinkedHashSet);
        }
    }

