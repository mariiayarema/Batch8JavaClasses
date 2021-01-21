package com.syntax.class32;

import com.syntax.class16.Homework2;

public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();
}

class Car extends Insurance {
    String carModel;

    Car(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Price from "+insuranceName+" for " +carModel +" car is 100$ per month" );
    }

    @Override
    void cancelInsurance() {
        System.out.println("Your car insurance is cancelled now");

    }
}
class Pet extends Insurance{
    String petType;
    Pet(String insuranceName, String petType){
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println("Price from "+insuranceName+" for " +petType +" is 10$ per month" );

    }

    @Override
    void cancelInsurance() {
        System.out.println("Your pet insurance is cancelled now");
    }
}
class Health extends Insurance{
    Health(String insuranceName){
        super(insuranceName);

    }


    @Override
    void getQuote() {
        System.out.println("Price from "+insuranceName+" is 500$ per month" );

    }

    @Override
    void cancelInsurance() {
        System.out.println("Your health insurance is cancelled now");
    }
}

class Main{
    public static void main(String[] args) {

        Insurance [] insurances={new Car("Geico","Toyota"),new Pet("AnimalHealth","Dog"), new Health("Fidelis Care")};

        for (Insurance i:insurances) {
            i.getQuote();
            i.cancelInsurance();
        }


    }
}

