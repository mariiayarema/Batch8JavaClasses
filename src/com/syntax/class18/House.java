package com.syntax.class18;

public class House {

    private  String room(String string){
        String result;
       result=string.replaceAll("[^aAeEiIoOuU]","");
       return result;
        }

    public static void main(String[] args) {
        House house=new House();
        System.out.println(house.room("heloooooo"));
    }
    }

