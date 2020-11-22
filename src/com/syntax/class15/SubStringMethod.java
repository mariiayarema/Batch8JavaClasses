package com.syntax.class15;

public class SubStringMethod {
    public static void main(String[] args) {
        String name = "Can you write the second m too ?";
        System.out.println(name.substring(0));
        System.out.println(name.substring(5));
        //will ignore everything before index 5
        System.out.println(name.substring(10));
        //will ignore everything before index 10
        System.out.println(name.substring(5,10));
        //it will ignore first 5 char and last 10 char
    }
}
