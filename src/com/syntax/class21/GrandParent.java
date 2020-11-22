package com.syntax.class21;

public class GrandParent {
    int money;
    GrandParent(){
        System.out.println("Constructor from GrandParent");
    }
    GrandParent(int money){
        this.money=money;
    }
    void print (){
        System.out.println(" i have this money"+money);
    }
}
