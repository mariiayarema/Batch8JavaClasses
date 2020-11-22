package com.syntax.class25;

public class Iphone extends Phone{
    @Override
    public void viewPicture() {
        System.out.println("We can check out photos using the photos app");
    }

    @Override
    public void unlock() {
        System.out.println("unlock with face");
    }
}
