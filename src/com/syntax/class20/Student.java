package com.syntax.class20;

public class Student {
    String name;
    String address;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
        void displayInfo() {
            System.out.println("Name is-"+name);
            System.out.println("Address is-"+address);
    }

    public static void main(String[] args) {
        Student student1=new Student("Maria","New York");
        student1.displayInfo();

        Student student2=new Student("Marta","Miami");
        student2.displayInfo();
    }

}
