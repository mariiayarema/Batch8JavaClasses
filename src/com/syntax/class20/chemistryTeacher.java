package com.syntax.class20;

public class chemistryTeacher extends Teacher {
    String subject;
    double salary;

    public void result(String subject,int salary){
        System.out.println("I am "+subject+" teacher and im making "+salary+" a year.");
    }

    public static void main(String[] args) {
        chemistryTeacher piano=new chemistryTeacher();
        piano.basic("Alex","Pluton");
        piano.result("chemistry", 45000);
    }
}
