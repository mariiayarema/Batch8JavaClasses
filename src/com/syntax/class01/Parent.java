package com.syntax.class01;

public class Parent {
    int number;
    Parent() {
        System.out.println("Parent Constructor without argument");
    }
    Parent(int number) {
        this.number = number;
        System.out.println(number);
    }

}
