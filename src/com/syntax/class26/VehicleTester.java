package com.syntax.class26;

public class VehicleTester {
    public static void main(String[] args) {
        //abstract class CAN NOT have an OBJECT
        Vehicle tesla=new Tesla("red","RX100","Tesla");
        tesla.brake();
        tesla.drive();
        tesla.start();
        tesla.stop();
        System.out.println( Vehicle.totalVehicle);

        new Toyota("yellow","camry","Toyota");
        System.out.println( Vehicle.totalVehicle);
    }
}
