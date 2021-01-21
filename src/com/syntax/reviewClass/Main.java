package com.syntax.reviewClass;



import org.apache.commons.math3.analysis.function.Add;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.junit.After;

import java.util.*;

class Main {
    public static void main(String[] args) {

        List <Map<String,Object>> dataList=new ArrayList<>();
        Map<String,Object> appleMap=new HashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10);

        dataList.add(appleMap);

        Map<String,Object> orangeMap=new HashMap<>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price",21.99);
        orangeMap.put("Quantity", 10);

        dataList.add(orangeMap);

        double totalPrice = 0;
        for (Map<String,Object> map:dataList) {
            String item = map.get("Items").toString();
            double price = Double.parseDouble(map.get("Price").toString());
            double quantity = Double.parseDouble(map.get("Quantity").toString());
            double itemTotal = price * quantity;
            System.out.println("Items: " + item + " Price: " + price + " Quantity: " + quantity + " SubTotal: " + itemTotal);
            totalPrice += itemTotal;
        }
        System.out.println("Your Purchase total : " + totalPrice);
        }
}

//        // find purchase total Price.
//        double purchaseTotalPrice = 0;
//
//        for (Map<String, Object> map : dataList) {
//        String items = map.get("Items").toString();
//        double price = Double.parseDouble(map.get("Price").toString());
//        double quantity = Double.parseDouble(map.get("Quantity").toString());
//        double lineTotal = price * quantity;
//
//        System.out.println("Items: " + items + " Price: " + price + " Quantity: " + quantity + " SubTotal: " + lineTotal);
//        purchaseTotalPrice += lineTotal;
//        }
//        System.out.println("Your Purchase total : " + purchaseTotalPrice);