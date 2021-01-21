package com.syntax.class34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {


        HashMap<String, Double> storeItemsDay1 = new HashMap<>();
        storeItemsDay1.put("Milk", 3.2);
        storeItemsDay1.put("Bread", 0.6);
        storeItemsDay1.put("Cake", 40.0);
        storeItemsDay1.put("Diaper", 39.99);
        storeItemsDay1.put("Eggs", 4.99);

        HashMap<String, Double> storeItemsDay2 = new HashMap<>();
        storeItemsDay2.put("beer", 12.0);
        storeItemsDay2.put("coffe", 3.75);
        storeItemsDay2.put("snack", 5.0);
        storeItemsDay2.putAll(storeItemsDay1);

        Set<String> set = storeItemsDay2.keySet();
        Double sum = 0.0;

        Iterator<String> iterator = set.iterator();

        System.out.println(storeItemsDay2.size()+" Before removing");

        while (iterator.hasNext()) {
            String item = iterator.next();

            if (storeItemsDay2.get(item) != null) {
                sum += storeItemsDay2.get(item);
            }
        }
        System.out.println(storeItemsDay2.size()+" After removing");
            //for(String item:set){
            //    sum+=storeItemsDay2.get(item);
            //}
            //   System.out.println("Total spending"+sum);

            //}

    }
}
