package com.syntax.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class ItteratorPractice {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);
        doubleArrayList.add(152.00);
        doubleArrayList.add(189.00);
        doubleArrayList.add(185.00);
        doubleArrayList.add(15.00);
        System.out.println(doubleArrayList);
        System.out.println("Before removing");
        //for (Double element : doubleArrayList) {
         //   if (element < 20) {
         //       doubleArrayList.remove(element);
        //  }
         //WE CANT USE FOR EACH LOOP WITH REMOVE METHOD
        //for (int i = 0; i<doubleArrayList.size() ; i++) {
          //  if(doubleArrayList.get(i)<20){
           //    doubleArrayList.remove(doubleArrayList.get(i));

          //  }
       // }
        //Unexpected result or runtime exeptions(after removing first element 15.9 will become at 0 index
       Iterator<Double> iterator=doubleArrayList.iterator();
       while(iterator.hasNext()){
           Double next=iterator.next();
           if(next<20){
               iterator.remove();
           }
       }
        System.out.println("After removing");
        System.out.println(doubleArrayList);

        
    }
}
