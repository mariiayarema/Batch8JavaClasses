package com.syntax.class24;

public class DogTester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // all 4 methods can be accessed
        //type of box and type of object are same no extra cost
        dog.appearance();
        dog.bark();
        dog.eat();
        dog.sleep();
        /*
        type of box and type of object is not same so we must pay
        some price if we are trying to store a parent in a child
        we will get an error or if we try to store child in a parent
        we will not be able to access all of the additional method
        from our child class this is the cost
         */
        dog=new ChowChow();
        dog.appearance();
        //dog=new Dog(); if we uncomment this we will get an error and
        //if we try this ChowChow chowChow=(Chow) dog;

        /*
        we can extract the contents of box/variable/container and
        we store these contents in the new box but we must follow
        all of the above rules
         */
        ChowChow chowChow=(ChowChow) dog;
        chowChow.special();
        chowChow.hunt();
    }
}
