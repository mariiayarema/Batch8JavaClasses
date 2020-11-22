package com.syntax.class19;

public class Task12 {

    String town;
    String street;
    int appNumber;

    Task12(String townValue, String streetValue, int appNumberValue){
        if(appNumberValue==0 ){
            System.out.println("Invalid app number");
        }else {
            town=townValue;
            street=streetValue;
            appNumber=appNumberValue;
            System.out.println("My adress is "+town+" ,"+street+" ,"+ appNumber);
        }
    }

    public static void main(String[] args) {
        Task12 yes=new Task12("New York","Forest street",12);
    }
}
