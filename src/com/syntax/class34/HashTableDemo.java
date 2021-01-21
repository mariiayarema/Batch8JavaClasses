package com.syntax.class34;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new Hashtable<>();
        //THREAD SAFE
        // hashMap.put(null, 111) -----NOT ALLOWED
        // hashMap.put("Jack", null)----NOT ALLOWED
        
        hashMap.put("Vladimir", 222);
        hashMap.put("Maria", 333);
        hashMap.put("Denis", 444);
        hashMap.put("Daria", 555);
        hashMap.put("Jasoor", 666);

        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next);
        }
    }
}
