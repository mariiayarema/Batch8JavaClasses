package com.syntax.GroupProject2Task3;

public class Truck extends Car {
    double weight;

    Truck(double carPrice, String carColor, double weight) {
        super(carPrice, carColor);
        this.weight=weight;
    }


    @Override
    double calculateSalePrice() {
        double finalPrice;
        if(weight>2000){
            finalPrice=carPrice*0.1;
        }else{
            finalPrice=carPrice*0.2;
        }
        return finalPrice;
    }
}
