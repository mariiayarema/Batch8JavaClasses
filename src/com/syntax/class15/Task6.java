package com.syntax.class15;

public class Task6 {
    public static void main(String[] args) {
        String a="Is it saturday?Is it raining? Do we have a Java Class today?";
       int sum=0;
        String [] b=a.split("[?]");
        for (String sen1:b) {
            sum++;

        }
        System.out.println(sum);




        /*String sen="Is it saturday? Is it raining?
        Do we have a Java Class today?";
        System.out.println(sen.replaceAll("[\\sA-Za-z0-9]","").length());
        */
    }
}
