package com.syntax.Practice;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = scanner.nextInt();
        System.out.println(Practice1.getLargestPrime(number));
    }

//SOLUTION1
        public static int getLargestPrime(int number) {
            int largestFactorNumber=0;
            if (number <= 1) {
                largestFactorNumber = -1;
            }else{
                LinkedHashSet<Integer>set=new LinkedHashSet<>();
                for(int i=2;i<=number;i++){
                    while(number%i==0){
                        set.add(i);
                        number=number/i;
                    }
                }
                System.out.println(set);
                for (Integer primeFactorNumber:set) {

                    if(primeFactorNumber>largestFactorNumber){
                        largestFactorNumber=primeFactorNumber;
                    }
                }
            }
            return largestFactorNumber;
    }
}
// SOLUTION 2
//    public static int getLargestPrime(int number) {
//        int largestFactorNumber=0;
//        if (number <= 1) {
//            largestFactorNumber = -1;
//        } else {
//        int div=2;
//        while(div<number){
//            if(number%div!=0){
//                div++;
//            }else{
//                number=number/div;
//                div=2;
//            }
//        }
//    }
//
//            return number;
//}

//    public static int getBucketCount(double area, double areaPerBucket) {
//        double bucketToBuy;
//        if (area <= 0 || areaPerBucket <= 0) {
//            bucketToBuy = -1;
//        } else {
//            bucketToBuy=area/areaPerBucket;
//            if (bucketToBuy % 2 != 0) {
//                bucketToBuy=bucketToBuy+1;
//                bucketToBuy=bucketToBuy;
//            }
//        }
//        return (int)bucketToBuy;
//    }
