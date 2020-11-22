package com.syntax.class14;

public class ConcatMethod {
    public static void main(String[] args) {
        String firstName="Ebrar";
        String lastName=" Gur";
        String name="Burju Kaya";
        String name2=null;
        String completeName=firstName.concat(lastName);
        System.out.println(completeName);
        //only with one String
        System.out.println(firstName+lastName+name);
        //here we can do a lot adding
        String comleteName=firstName.concat(name2);

    }
}
