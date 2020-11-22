package com.syntax.class20;

public class A {
  String name;
    String city;

    A(String nameValue, String cityValue){
        this.name=nameValue;
        this.city=cityValue;
    }

      static void   printF(String city, String name){
         System.out.println("My name is "+ name + " and i am from "+city);

    }

    public static void main(String[] args) {
        A.printF("New York","Maria");
    }
}
