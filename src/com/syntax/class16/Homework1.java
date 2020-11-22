package com.syntax.class16;

public class Homework1 {

    private static String createEmail(String userName, String lastName, String mailType) {
        return userName.toLowerCase() + lastName.toLowerCase() + "@" + mailType + ".com";
    }

    public static void main(String[] args) {

        Homework1 hw=new Homework1();
        String email=Homework1.createEmail("Mariia", "Yarema", "gmail");
        System.out.println(email);

    }


}