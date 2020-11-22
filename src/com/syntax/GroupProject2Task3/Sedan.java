package com.syntax.GroupProject2Task3;

public class Sedan extends Car {
 double length;
    Sedan(double carPrice, String carColor, double length) {
        super(carPrice, carColor);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        double finalPrice;
        if(length>20){
            finalPrice=carPrice*0.05;
        }else{
            finalPrice=carPrice*0.1;
        }
        return finalPrice;
    }
}
