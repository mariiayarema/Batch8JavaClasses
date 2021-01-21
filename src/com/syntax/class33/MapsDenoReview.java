package com.syntax.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsDenoReview {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Eggs", 12.99);
        hashMap.put("Milk", 10.0);
        hashMap.put("Cake", 20.0);

        Iterator<Map.Entry<String, Double>> iterator = hashMap.entrySet().iterator();
        //hashMap.entrySet().removeIf(element -> element.getValue()>10);
        while (iterator.hasNext()) {
            Map.Entry<String, Double> element=iterator.next();
            if(element.getValue()>10.0) {
                iterator.remove();
            }
        }


    }

}
