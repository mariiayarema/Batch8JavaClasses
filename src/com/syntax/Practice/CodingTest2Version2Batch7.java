package com.syntax.Practice;

public class CodingTest2Version2Batch7 {
    //    Write a method that excepts an array and from that array it returns the sum of 4 largest numbers
//    public int sumLargestFourNumbers(int[] arr){}
//    input 10,20,5,25,40 ans=95

    public int sumLargestFourNumbers(int[] arr){
        int sumLargestFourNumber=0;
        //finding first largest number
        int largerNumber1=0;
        for (int i = 0; i <arr.length ; i++) {
           if(arr[i]>largerNumber1){
               largerNumber1=arr[i];
            }
        }
        //finding second largest number
        int largerNumber2=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==largerNumber1){
               continue;
            }else if(arr[i]>largerNumber2){
                largerNumber2=arr[i];
            }
        }
        //finding third largest number
        int largerNumber3=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==largerNumber1||arr[i]==largerNumber2){
                continue;
            }else if(arr[i]>largerNumber3){
                largerNumber3=arr[i];
            }
        }
        //finding forth largest number
        int largerNumber4=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==largerNumber1||arr[i]==largerNumber2||arr[i]==largerNumber3){
                continue;
            }else if(arr[i]>largerNumber4){
                largerNumber4=arr[i];
            }
        }

        sumLargestFourNumber=largerNumber1+largerNumber2+largerNumber3+largerNumber4;
        return sumLargestFourNumber;
    }

    public static void main(String[] args) {
        CodingTest2Version2Batch7 exam=new CodingTest2Version2Batch7();
        int [] arr={10,20,5,25,40};
        System.out.println(exam.sumLargestFourNumbers(arr));
    }

}
