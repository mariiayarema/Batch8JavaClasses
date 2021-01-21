package com.syntax.class34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo4 {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jack", 111);
        hashMap.put("Vladimir", 222);
        hashMap.put("Maria", 333);
        hashMap.put("Denis", 444);
        hashMap.put("Daria", 555);
        hashMap.put("Jasoor", 666);

        Iterator <Map.Entry<String,Integer>> iterator=hashMap.entrySet().iterator();
while(iterator.hasNext()){
    Map.Entry<String,Integer> next=iterator.next();
    System.out.println(next);


}

    }
}
