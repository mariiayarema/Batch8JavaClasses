package com.syntax.GroupProject2Task3;

public class CarTester {
    public static void main(String[] args) {
        Car [] car={new Sedan(30000,"red",15),new Truck(100000,"grey",2500)};
        for (Car cc:car) {
            System.out.println(cc.calculateSalePrice());
        }
    }
}
