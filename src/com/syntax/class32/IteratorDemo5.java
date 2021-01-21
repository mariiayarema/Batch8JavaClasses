package com.syntax.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo5 {
    public static void main(String[] args) {
        ArrayList <String> drinks=new ArrayList<>();
        drinks.add("Tea");
        drinks.add("Coffe");
        drinks.add("Milk");
        drinks.add("Soda");
       drinks.add("Scotch");
        drinks.add("Vodka");
        drinks.add("Turlish Raki");

        Iterator<String> iterator=drinks.iterator();
        while(iterator.hasNext()){
           String next=iterator.next();
            if(next.equals("Scotch")||next.equals("Vodka")||next.equals("Turlish Raki")){
                iterator.remove();
            }
        }
        System.out.println(drinks);
    }
}
