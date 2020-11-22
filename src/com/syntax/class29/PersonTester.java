package com.syntax.class29;


public class PersonTester {
    public static void main(String[] args) {

        Person davit = new Person("Davit", "1234567", 25, 3000);
        davit.setTaxPaid("45641351",-1);
        davit.setTaxPaid("45641351",1);
        System.out.println(davit.getTaxPaid("45641351"));
        System.out.println(davit.getTaxPaid("1234567"));

    }
}
