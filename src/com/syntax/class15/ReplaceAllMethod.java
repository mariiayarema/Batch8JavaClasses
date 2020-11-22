package com.syntax.class15;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        //System.out.println(mix.replaceAll("[0-9]", ""));
        //System.out.println(mix.replaceAll("[a-z]", ""));
        //System.out.println(mix.replaceAll("[a-z A-Z]", ""));
       // System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));

        //https://regexr.com/

        String mix = "3213Hello 89 World354545 *&***^&*^&*";
        System.out.println(mix.replaceAll("[0-9]", ""));
        System.out.println(mix.replaceAll("[a-z]", ""));
        System.out.println(mix.replaceAll("[a-z A-Z]", ""));
        System.out.println(mix.replaceAll("[^A-Z a-z 0-9]", ""));

    }

}
