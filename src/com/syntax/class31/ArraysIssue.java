package com.syntax.class31;

import java.util.Arrays;

public class ArraysIssue {
    public static void main(String[] args) {
        String name="Ali";
        String name1="Nabin";
        String name3="Qasim";
        //variables can hold one value at time if we need to store 1000
        // values we need to declare 1000 variables
        int initialSize=3;
        int elementSStored=0;
        String [] names=new String[3];
        names[0]="Ali;";
        elementSStored++;
        names[1]="Nabin";
        elementSStored++;
        names[2]="Qasim";
        elementSStored++;
       // names[3]="Davit"; Array index out of bound as the size
        //of the array was 3 ; we can not store more than 3 elements

     // arrays are fixet in size we have to provide the size
        // of the array in advance before we can use it
        System.out.println(Arrays.toString(names));
        if(names.length>=elementSStored){
            String [] temp=new String[initialSize*2];
            temp[0]=names[0];
            temp[1]=names[1];
            temp[2]=names[2];
            temp[3]="Danilo";

        }

    }
}
