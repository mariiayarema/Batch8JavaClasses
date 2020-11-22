package com.syntax.class20;

public class ThisKeyWord {
    String name;
    String address;
    int age;
    String id;
    String phone;
    String SSN;
    char gender;
    char martialStatus;
    double height;
    double weights;
    int numberOfKids;
    double salary;
    String education;


    ThisKeyWord(String name, int age, String phone, double salary){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;

    }
    ThisKeyWord(String name, int age, String phone, double salary, char martialStatus, int numberOfKids, String education,double height, double weigths){
        this(name,age,phone,salary);
        this.martialStatus=martialStatus;
        this.numberOfKids=numberOfKids;
        this.education=education;
        this.weights=weigths;
        this.height=height;
    }
    ThisKeyWord (String name, int age, String phone, double salary, char martialStatus, int numberOfKids, String education,double height, double weigths, char gender, String SSN, String id){
        this(name, age, phone, salary, martialStatus, numberOfKids, education,weigths,height);
        this.gender=gender;
        this.SSN=SSN;
        this.id=id;

    }



    public static void main(String[] args) {
        ThisKeyWord person=new ThisKeyWord("Maria", 29,"631-453-2940",100000);
    }
}
