package com.syntax.GroupProject2Task2;

public class MarksTester {
    public static void main(String[] args) {
        A studentA=new A(45,67,56);
        System.out.println("Average of mars for studentA is "+studentA.getPercentage());
        B studentB=new B(100,76,88,99);
        System.out.println("Average of marks for studentB is "+studentB.getPercentage());
    }
}
