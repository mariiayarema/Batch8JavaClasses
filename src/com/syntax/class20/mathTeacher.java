package com.syntax.class20;

public class mathTeacher extends Teacher {
    String subject;
    double salary;

    public void result(String subject,int salary){
        System.out.println("I am "+subject+" teacher and im making "+salary+" a year.");
    }

    public static void main(String[] args) {
        mathTeacher piano=new mathTeacher();
        piano.basic("Masha","Harvard");
        piano.result("math", 50000);
    }
}
