package com.syntax.class28;

public interface MyInterface {
    //before java 8
    public static final String name="hi";
     void printInfo();

     //java 8
    static void printNumber(){
        System.out.println("346643");
    }
     default void printName(){
         //the default methods are used to support lambdas
     }
}
