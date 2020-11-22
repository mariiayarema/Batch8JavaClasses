package com.syntax.class20;

public class ClassB extends ClassC {

    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        System.out.println(ClassB.Mult(2,7));
        System.out.println(ClassB.add(2,2));
    }
}
