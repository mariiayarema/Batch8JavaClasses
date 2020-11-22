package com.syntax.class15;

public class Split {
    public static void main(String[] args) {

        String name="Burju*Maria*Qasim";
        String [] array=name.split("[^ A-Z a-z]");
        for(String name1:array) {
            System.out.println(name1);


            String str="I love Java classes at Syntax";
            String [] a=str.split(" ");
        }


    }
}
