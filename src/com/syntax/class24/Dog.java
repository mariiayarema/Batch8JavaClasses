package com.syntax.class24;

public class Dog {
    void bark(){
        System.out.println("Dog is barking");
    }
    void sleep(){
        System.out.println("Dog is sleeping");
    }
    void eat(){
        System.out.println("Dog is eating");
    }
    void appearance(){
        System.out.println("I dont have any appearance i am general dog class");
    }
}
class Cockapoo extends Dog{
    void appearance(){
        System.out.println("I have long hair");
    }
    void sleep(){
        System.out.println("I sleep 16 hours a day");
    }
}

class ChowChow extends Dog{
    void appearance(){
        System.out.println("I have sharp teeth");
    }
    void special(){
        System.out.println("I love kids");
    }
    void hunt(){
        System.out.println("Hunt Squirrels");
    }

}