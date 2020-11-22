package com.syntax.class25;

public class HP extends Computer{
    public HP(String brand) {
        super(brand);
    }
    public void secure(){
        System.out.println(brand+" can be unlocked fingerprints");
    }
}
