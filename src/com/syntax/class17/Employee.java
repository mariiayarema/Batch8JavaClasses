package com.syntax.class17;

public class Employee {


        int empID;
        double salary;
        static String CEO;




        public static void main(String[] args) {
            com.syntax.class17.Employee maria=new com.syntax.class17.Employee();
            maria.empID=4332;
            maria.salary=100000;
            com.syntax.class17.Employee.CEO="Sumair";



            com.syntax.class17.Employee evgenii=new com.syntax.class17.Employee();
            evgenii.empID=5674;
            evgenii.salary=300000;
            System.out.println(CEO);

            System.out.println(evgenii.CEO);

        }
    }


