package com.syntax.class19;

import java.lang.reflect.Constructor;

public class Constructors {
    static int number;
    static String name;
    static char character;

    Constructors () {
        System.out.println("I will be called everytime you create an object of this class");
    }
    static void print(){
        System.out.println("Number "+ "name "+name+" character"+character);
    }
    Constructors (int numberValue, String nameValue, char characterValue){
        System.out.println("I am not a useless constructor i am");
        number=numberValue;
        name=nameValue;
        character=characterValue;
    }

    public static void main(String[] args) {
        Constructors constructors=new Constructors();
        constructors.print();
        constructors.character='A';

        Constructors constructor2=new Constructors(100,"Vlad",'A');

        //Constructors
        //constructor name of the variable
        //=assignment
        //new we want an object
        //Constractor()
    }
}

