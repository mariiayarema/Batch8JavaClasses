package com.syntax.class01;

public class Child extends Parent {
    int number1;
    Child() {
        System.out.println("Child constructor without argument");
    }
    Child(int number,int number1) {
        super(number);
        this.number1 = number1;
    }
}
