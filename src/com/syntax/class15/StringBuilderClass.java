package com.syntax.class15;

public class StringBuilderClass {
    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" word");
        System.out.println(stringBuilder);
        
        String string ="Hello";
        string.concat("World");
        System.out.println(string);

    }
}