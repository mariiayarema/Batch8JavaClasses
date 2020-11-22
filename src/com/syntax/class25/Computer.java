package com.syntax.class25;

public class Computer extends SmartMachine {

  String brand;
  Computer(String brand){
      this.brand=brand;//using this to differentiate between local and instance variable
  }
  public void run(){
      System.out.println(brand+" can run");
  }

  public void transfer(){
      System.out.println(brand+" can transfer data");
  }
  public void storage(){
      System.out.println(brand+" can store");
  }


}
