package com.syntax.class34;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    Person(String name, String lastName, int age, double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    public void getUserDetails(){
        System.out.println("User name is "+name+" , last name is "+lastName+" ,age is "+age+" ,salary is "+salary);
    }

    public static void main(String[] args) {
//        Create a Person class with following private fields: name, lastName, age, salary.
//        Variables should be initialized through constructor.
//        Inside the class also create a method to print user details.
//        In Test Class create a Map that will store key in ascending order.
//        In that map store personId and a Person Object. Print each object details.


    }
}
