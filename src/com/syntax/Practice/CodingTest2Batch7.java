package com.syntax.Practice;

public class CodingTest2Batch7 {
//    Write a method that excepts an array and from that array it returns the sum of 4 largest numbers
//    public int sumLargestFourNumbers(int[] arr){}
//    input 10,20,5,25,40 ans=95

    public int sumLargestFourNumbers(int[] arr){
        int smallestNumber=arr[0];
        int sumLargestFourNumber=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<smallestNumber){
                smallestNumber=arr[i];
            }
        }for (int j = 0; j <arr.length ; j++) {
            if(arr[j]!=smallestNumber){
                sumLargestFourNumber+=arr[j];
            }else{
                continue;
            }
        }
        return sumLargestFourNumber;
    }

    public static void main(String[] args) {
        CodingTest2Batch7 codingTest2Batch7=new CodingTest2Batch7();
        int [] arr={10,20,5,25,40};
        System.out.println(codingTest2Batch7.sumLargestFourNumbers(arr));
    }
}
