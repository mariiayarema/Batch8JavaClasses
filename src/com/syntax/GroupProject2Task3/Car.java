package com.syntax.GroupProject2Task3;

abstract public class Car {

    double carPrice;
    String carColor;
    Car(double carPrice,String carColor){
        this.carPrice=carPrice;
        this.carColor=carColor;
    }
    abstract double calculateSalePrice();
}
