package com.syntax.reviewClass;

public class StringClass {
    public static void main(String[] args) {
        String str="Danilo";
        String str2=new String("anything!32##$%^*@(");

        System.out.println(str2);
        System.out.println(str2.length());
        String name="Mina123";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        String newString=str.concat(name);
        System.out.println(newString);
        //always prefer the + combine two Strings
        //why because we can get an error in some
        //cases when using concat method
        String var1=null;
        String var2="Burju";
        //System.out.println(var1.concat(var2));//Error NullpointerException
        //System.out.println(var2.concat(var1));//Null pointer Exception
        System.out.println(var1+var2);
        System.out.println(var2+var1);

        //String is immutable
     String name2="LOL";
     String name3="LOL";
        System.out.println(name2==name3);
        System.out.println(name2.equals(name3));
    }
}
