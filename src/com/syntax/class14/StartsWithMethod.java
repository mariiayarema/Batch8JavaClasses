package com.syntax.class14;

public class StartsWithMethod {
    public static void main(String[] args) {

      String var="maybe you can give a real life" ;
        System.out.println(var.startsWith("real"));
        //checking if it starts from real world or not
        //false
        System.out.println(var.startsWith("m"));
        //true
        System.out.println(var.startsWith("MAYBE"));
        //false


    }

}
