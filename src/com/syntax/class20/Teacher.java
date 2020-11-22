package com.syntax.class20;

public class Teacher {
    String name;
    String schoolName;

    public void basic (String name, String schoolName){
        System.out.println("Hello my name is "+name+" and i working at "+schoolName+" school.");
    }

    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.basic("Ksenia","Hogwards");
    }

}
