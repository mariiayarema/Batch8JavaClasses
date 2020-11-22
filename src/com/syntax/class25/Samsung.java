package com.syntax.class25;

public class Samsung extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("to view pictures use the Gallery app");
    }

    @Override
    public void unlock() {
        System.out.println("unlock using the password");
    }
}
