package com.syntax.class16;

public class Homework2 {
 
    boolean isPrime(int number) {

        boolean isPrime = true;

            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }


        public static void main (String [] args){
        Homework2 hw=new Homework2();

            System.out.println(hw.isPrime(8));

        }
    }


