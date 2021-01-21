package com.syntax.class32;

import java.util.LinkedList;

public class LinkListDemo2 {
    public static void main(String[] args) {

        LinkedList<String> cities=new LinkedList<>();

        cities.add("Tampa");
        cities.add("Las Vegas");
        cities.add("Kabul");
        cities.add("Monrovia");
        cities.add("Brooklyn");
        cities.add("New York");
        cities.add("San Diego");
        System.out.println(cities);

        cities.addFirst("Istanbul");
        cities.addLast("Moscow");
        cities.add(3,"New Orlean");
        System.out.println(cities);
    }
}
