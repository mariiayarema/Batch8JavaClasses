package com.syntax.class25;

public class Apple extends Computer{
    public Apple(String brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println("Runs faster");
    }

    @Override
    public void storage() {
        System.out.println("Saves the data in a different way");
    }

    @Override
    public void transfer() {
        super.transfer();
    }
}
