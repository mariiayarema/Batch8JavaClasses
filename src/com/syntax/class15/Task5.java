package com.syntax.class15;

public class Task5 {
    public static void main(String[] args) {
        String mix="SDGGcvbfg454748#@$%";

        System.out.println(mix=(mix.replaceAll("[^0-9]","")));
        System.out.println(mix.length());
//or mix.replaceAll(( " [\\sA-za-z0-9]", "").length)
    }
}
