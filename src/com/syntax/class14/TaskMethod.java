package com.syntax.class14;

public class TaskMethod {
    public static void main(String[] args) {

      String username="Mariia";
      String password="123456789";
      String conPassword="123456789";

      if(username.isEmpty() || password.isEmpty()) {
          System.out.println("Username and Password cannot be empty");
      } else if(password.length()<8) {
          System.out.println("Password is too short");
      } else if(password.contains(username)) {
          System.out.println("Password cannot contain username");
      } else if(!password.equals(conPassword)) {
          System.out.println("Password do not match");
      }else {
          System.out.println("Your username and password has been created");
      }
    }
}
