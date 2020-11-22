package com.syntax.class25;

abstract public class Phone {
    public void makeCall(){
        System.out.println("Phone makes call");
    }
    public void sendText(){
        System.out.println("phone send text");
    }
    public abstract void viewPicture();
    public abstract void unlock();
}
