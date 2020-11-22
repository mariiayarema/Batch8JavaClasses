package com.syntax.class20;

public class Task3 {

    String name;
    int age;
    double salary;

    private Task3(String name) {
        //i can only create an object of my class from the same class
    this.name=name;
    }

    Task3(int age){
        this.age=age;
    }
    public Task3(double salary) {
        this.salary=salary;
    }

    public static void main(String[] args) {
        Task3 task1= new Task3(1.2);
        System.out.println(task1.name);
        System.out.println(task1.age);
        System.out.println(task1.salary);
    }





}
