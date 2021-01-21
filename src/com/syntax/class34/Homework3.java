package com.syntax.class34;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Homework3 {
    public static void main(String[] args) {
//        Create a map of Best Buy store. Place
//        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//        Retrieve all keys and values from a Best Buy map using EntrySet.

        TreeMap <Long,String> bestBuyStore=new TreeMap<>();
        bestBuyStore.put(7664847l,"Printer");
        bestBuyStore.put(7879885l,"TV");
        bestBuyStore.put(7135263l,"Computer");
        bestBuyStore.put(7023455l,"Coffee Machine");
        bestBuyStore.put(7592000l,"Vacuums");
        bestBuyStore.put(7592103l,"Hair Dryer");

        Iterator<Map.Entry<Long,String>> iterator=bestBuyStore.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Long,String> next=iterator.next();
            System.out.println(next);

        }

    }
}
