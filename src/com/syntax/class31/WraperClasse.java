package com.syntax.class31;

import java.util.ArrayList;

public class WraperClasse {
    public static void main(String[] args) {
        //we have 8 primitive tipes and for each primitive
        //type we have a wrapper class
        byte byteNumbers = 127; // can store max -128 to 127;
        short shortNumbers = 1000;//can store number from -32768 to 32767
        int number = 10; // can store up to 2 billion
        long longNumbers = 1364737338383l;
        float floatNumbers = 1520.2125f;
        double numberWithDecimalPoints = 10.5;
        char characters = 'A';
        boolean flags = true;
        String name = "Asghar";

        String stringNumber = "10";
        int convertedNumber = Integer.parseInt(stringNumber);
        System.out.println(convertedNumber * 2);


        Byte nonPrimitiveByteNumbers = 127; // can store max -128 to 127;
        Short nonPrimitiveShortNumbers = 1000;//can store number from -32768 to 32767
        Integer nonPrimitiveNumber = 10; // can store up to 2 billion

        Long nonPrimitiveLongNumbers = 1364737338383l;
        Float nonPrimitiveFloatNumbers = 1520.2125f;
        Double nonPrimitiveNumberWithDecimalPoints = 10.5;
        Character nonPrimitiveCharacters = 'A';
        Boolean nonPrimitiveFlags = true;

        int primitiveInt = 10;
        Integer nonPrimitiveInteger = primitiveInt;// AUTOBOXING converting to Object
        primitiveInt=nonPrimitiveInteger;// converting from object to int
        System.out.println(nonPrimitiveInteger.doubleValue());

        //ArrayList <int> integerArrayList=new ArrayList <>();
        // We cant use int with Collection only objects
    }
}