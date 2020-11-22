package com.syntax.class22;
class Main {
    String model;
    double price;
    double quantity;

    public static void carStochValue(String model,double price, double quantity){
        System.out.println(model+" Stock Value "+price*quantity);
    }

    public static void main(String [] args){
        Main car1=new Main();
        car1.carStochValue("Toyota 2019",50000,50);
        Main car2=new Main();
        car2.carStochValue("BMW 2019",326.490,2000.0);
    }
}

