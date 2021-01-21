package com.syntax.class31;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
       ArrayList <String> alist=new ArrayList <> ();
        alist.add("Daniklo");
        alist.add("Asghar");
        alist.add("Burju");
        alist.add("Eduard");
        alist.add("Daria");
        System.out.println(alist.isEmpty());
        System.out.println(alist.contains("Danilo"));
        alist.remove("Burju");
        System.out.println(alist.size());
        System.out.println(alist);

    }
}
