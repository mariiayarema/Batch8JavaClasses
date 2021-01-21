package com.syntax.class34;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Homework7 {
    public static void main(String[] args) {
//        Create the collection that will store single uniques Objects of
//        a String type in which order is preserved.
//        Write a logic to concatenate all string from the collection.
//        Create a collection of integers in which you can keep duplicates.
//        Write a logic to find sum of all integers
        LinkedHashSet <String> partsOfSentence= new LinkedHashSet<>();
        partsOfSentence.add("Live");
        partsOfSentence.add("your");
        partsOfSentence.add("life");
        partsOfSentence.add("as");
        partsOfSentence.add("if");
        partsOfSentence.add("there");
        partsOfSentence.add("is");
        partsOfSentence.add("no");
        partsOfSentence.add("tomorrow");

        String beautifulSentence="";
        for (String part:partsOfSentence) {
            beautifulSentence+=" "+part;
        }
        System.out.println(beautifulSentence);
    }
}
