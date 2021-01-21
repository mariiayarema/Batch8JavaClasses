package com.syntax.class34;

import java.util.HashMap;

public class MapMethods {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jack", 111);
        hashMap.put("Vladimir", 222);
        hashMap.put("Maria", 333);
        hashMap.put("Denis", 444);
        hashMap.put("Daria", 555);
        hashMap.put("Jasoor", 666);
        System.out.println(hashMap);
        hashMap.remove("Denis");//removing Denis
        System.out.println(hashMap);
        hashMap.put("Denis", 444);//adding Denis back to the map
        System.out.println(hashMap.get("Maria"));
        System.out.println(hashMap.containsKey("Jack"));
        System.out.println(hashMap.containsValue(999));
    }
}
