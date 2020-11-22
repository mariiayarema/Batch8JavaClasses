package com.syntax.class15;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
    String mName, dName, gender, bName;

    Scanner scan= new Scanner (System.in);
    System.out.println("Mom's first name?");
    mName=scan.nextLine();
    System.out.println("Dad's? first name");
    dName=scan.nextLine();
    System.out.println("Boy or Girl?");
    gender=scan.nextLine();

    if(gender.toLowerCase().startsWith("b")) {
        String firstPart=((dName.substring(0, dName.length()/2)));
        String secondPart=mName.substring(mName.length()/2);
        bName=firstPart+secondPart;
        System.out.println(bName);
    }else if (gender.toLowerCase().startsWith("g")) {
        String firstPart2=((mName.substring(0, mName.length()/2)));
        String secondPart2=dName.substring(dName.length()/2);
        bName=firstPart2+secondPart2;
        System.out.println(bName);
    }else{
        System.out.println("Invalid gender");

    }




    }
}