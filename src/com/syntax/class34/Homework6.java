package com.syntax.class34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Homework6 {
    public static void main(String[] args) {
//        Create a Map that will store Employee name and salary.
//        Write a logic to retrieve an employee who gets the highest salary.
//        Output should be in the below format John Smith=$100000
        HashMap <String,Integer> employee =new HashMap<>();
        employee.put("Mariia",300000);
        employee.put("Ivan",100000);
        employee.put("Ievgenii",600000);
        employee.put("Olena",150000);
        employee.put("Sofiia",120000);

        Iterator<Map.Entry<String,Integer>> iterator=employee.entrySet().iterator();
        Integer maxSalary=0;
        String employeeMaxSalary="";
        while(iterator.hasNext()){
            Map.Entry<String,Integer> nextEmployee=iterator.next();

            if(nextEmployee.getValue()>maxSalary){
                maxSalary=nextEmployee.getValue();
                employeeMaxSalary=nextEmployee.getKey();
            }

        }
        System.out.println(employeeMaxSalary+"=$"+maxSalary);
    }
}

//So first loop we are looking for highest salary
// second we store highest salary in new map
// third loop we are getting key and value from our highest salary entry??