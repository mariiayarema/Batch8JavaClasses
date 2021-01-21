package com.syntax.class33;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        Person jasoorOBJ=new Person("Jasoor",111,20);
        Person kinOBJ=new Person("Kin",222,22);
        Person qasimOBJ=new Person("Qasim",333,26);
        Person aigerhimOBJ=new Person("Aigerhim",444,16);
        Person burjuOBJ=new Person("Burju",555,50);

        Map<Integer,Person> peopleInUSA=new HashMap<>();
        peopleInUSA.put(111,jasoorOBJ);
        peopleInUSA.put(222,kinOBJ);
        peopleInUSA.put(333,qasimOBJ);
        peopleInUSA.put(444,aigerhimOBJ);
        peopleInUSA.put(555,burjuOBJ);

        System.out.println(peopleInUSA.get(555).name);
        System.out.println(peopleInUSA);

    }
}
