package com.syntax.GroupProject2Task4;

public class Registration {
    private String email;
    private String userName;
    private String password;

    Registration(String email, String userName,String password){
        this.email=email;
        this.userName=userName;
        this.password=password;
    }

    public void setUserName(String userName){
        if(userName.isEmpty() || userName.length()<6){
            System.out.println("Invalid userName");
        }else{
            this.userName=userName;
            System.out.println("User name "+userName);
        }
    }
    public void setEmail(String email){
        if(email.endsWith("yahoo")){
            this.email=email;
            System.out.println("User email "+email);
        }else{
            System.out.println("Invalid email");
        }
    }
    public void setPassword(String password){
        if(password.isEmpty() || password.length()<6 || password.contains(userName)){
            System.out.println("Invalid password");
        }else{
            this.password=password;
            System.out.println("User password "+password);
        }
    }



}
