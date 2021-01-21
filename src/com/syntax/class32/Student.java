package com.syntax.class32;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student {
    String studentName;
    int studentID;
    public Student(String studentName, int studentID){
        this.studentName=studentName;
        this.studentID=studentID;
    }


    public static void main(String[] args) {


        Set<Student> student = new HashSet<>();
        Student student1=new Student("Mariia", 3454);
        Student student2=new Student("Evgenii",7688);
        Student student3=new Student("Olena",4400);
        student.add(student1);
        student.add(student2);
        student.add(student3);

        Iterator <Student> iterator=student.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().studentName);

        }
    }
}
