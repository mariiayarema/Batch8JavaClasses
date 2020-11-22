package com.syntax.class19;

public class Student {
    String name;
    int mathGrade;
    int philosophyGrade;
    int englishGrade;

    Student (String nameValue,int mathValue, int philosophyValue, int englishValue) {
        mathGrade = mathValue;
        philosophyGrade = philosophyValue;
        englishGrade = englishValue;
        name = nameValue;
    }
    void printGradeAverage() {
        if(mathGrade<0 || mathGrade>100){
            System.out.println("Invalid grade");
        }else if(philosophyGrade<0 ){
            System.out.println("Invalid grade");
        }else if (englishGrade<0 ){
            System.out.println("Invalid grade");
        }else{

            int avg=(mathGrade+philosophyGrade+englishGrade)/3;
            System.out.println("Average marks for "+ name+" "+avg);
        }
    }

    public static void main(String[] args) {
        Student student1=new Student("Ivan",78,98,45);
        student1.printGradeAverage();
        Student student2=new Student("Mariia",95,98,99);
        student2.printGradeAverage();
        Student student3=new Student("Oleh",-24,-25,-1);
        student3.printGradeAverage();
        Student student4=new Student("Natasha",43,66,77);
        student4.printGradeAverage();
        Student student5=new Student("Ksenia",12,11,45);
        student5.printGradeAverage();

    }
}
