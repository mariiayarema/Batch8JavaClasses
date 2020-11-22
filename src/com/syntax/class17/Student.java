package com.syntax.class17;

public class Student {
    String studentName;
    int studentID;
    static int numberOfStudents;

    public void totalNumberOfStudents() {
        System.out.println("Total number of students is "+ numberOfStudents);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.studentID=4354;
        s1.studentName="Mariia";
        numberOfStudents++;

        Student s2=new Student();
        s2.studentID=5765;
        s2.studentName="Oleh";
        numberOfStudents++;


        Student s3=new Student();
        s3.studentID=7548;
        s3.studentName="Marta";
        numberOfStudents++;
        s3.totalNumberOfStudents();

    }
}
