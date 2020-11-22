package com.syntax.class14;

public class LengthMethod {
    public static void main(String[] args) {
        String name="Qasim";
       int length= name.length();
        System.out.println(length);
        name="";
        System.out.println(name.length());
        name="Ahmad Qasim";
        System.out.println(name.length());
        name=" Qasim      ";
        System.out.println(name.length());

        if(name.length()>10) {
            System.out.println("you are great");
        }
    }
}
