package com.syntax.Repl;

public class Animal {


    String type;
    Animal(String type){
        this.type=type;
    }
    void sleep(){
        System.out.println("I like sleeps a lot");
    }
    void eat(){
        System.out.println(type+" eats");
    }
}
