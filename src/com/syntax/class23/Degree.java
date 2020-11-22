package com.syntax.class23;

public class Degree {

    public void  getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends Degree{

}

class Masters extends Degree{
    public void  getPrerequisite(){
        System.out.println("To get a degree you need high Bachelor diploma");
    }
}

class Task1{
    public static void main(String[] args) {
        Bachelors b=new Bachelors();
        b.getPrerequisite();

        Masters m=new Masters();
        m.getPrerequisite();
    }
}

