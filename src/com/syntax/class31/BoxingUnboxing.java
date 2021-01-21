package com.syntax.class31;

public class BoxingUnboxing {
    public static void main(String[] args) {
        Integer nonPrimitive=10; //AutoBoxing
        int primitiveInt=nonPrimitive; //AutoUnboxing

        Integer integer=new Integer(10); //Boxing long way
        int number=integer.intValue();// Unboxing



        String string=new String("Burju");//longer way -Boxing
        String string2="Burju";//shorter way AutoBoxing
    }

}
