package com.syntax.class21;

public class Parent extends GrandParent {
    Parent() {
        System.out.println(" constructor from Parent class");
    }
    Parent(int money){
        super(money);
    }
}
