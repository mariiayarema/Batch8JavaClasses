package com.syntax.class21;

public class UserInfo extends UserClass {
    String userAddress;

    UserInfo(String userAddress, String name, String mobileNumber) {
        super(name,mobileNumber);
        this.userAddress=userAddress;

    }
    void userDetail(){
        System.out.println("My name is "+super.getName()+ ". My address is "+userAddress+". My phone number is "+super.getMobileNumber());
    }

}