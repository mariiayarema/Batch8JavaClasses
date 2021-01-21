package com.syntax.class34;

import com.sun.tools.javac.comp.Check;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Homework1 {
    public static void main(String[] args) {


//        Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//        Check how many entries you have?
//        Update company on a 4th floor
//        Remove company on the 7th floor
//        Print your map

        LinkedHashMap<Integer,String> buildings=new LinkedHashMap <> ();
        buildings.put(1,"Google");
        buildings.put(2,"Syntax");
        buildings.put(2,"Amazon");
        buildings.put(3,"Amazon");
        buildings.put(4,"Facebook");
        buildings.put(5,"Twitter");
        buildings.put(7,"Google");

        System.out.println(buildings.size());
        buildings.put(4,"Apple");
        System.out.println(buildings.get(4));
        buildings.remove(7);
        System.out.println(buildings);
        }
    }

