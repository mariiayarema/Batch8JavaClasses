package com.syntax.class22;

public class MethodOverloading {
    public void print(){
        System.out.println("Hello");
    }
    public void print(String name,int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Hello "+name);
        }

    }
    public void print(int number,String name){
        System.out.println("Hello "+name+" number"+number);
    }

}
