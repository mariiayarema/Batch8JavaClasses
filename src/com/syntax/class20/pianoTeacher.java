package com.syntax.class20;

public class pianoTeacher extends Teacher{

    String subject;
    double salary;

    public void result(String subject,int salary){
        System.out.println("I am "+subject+" teacher and im making "+salary+" a year.");
    }

    public static void main(String[] args) {
        pianoTeacher piano=new pianoTeacher();
        piano.basic("Olena","Halileo");
        piano.result("piano", 60000);
    }
}
