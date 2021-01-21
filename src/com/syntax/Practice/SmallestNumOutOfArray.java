package com.syntax.Practice;

import java.util.Arrays;

public class SmallestNumOutOfArray {
    public static int smallestNum(int[] arr) {
        Arrays.sort(arr);
        int smallestNum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallestNum) {
                smallestNum++;
            }
        }
        return smallestNum;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6};
        System.out.println(smallestNum(a));
        int[] b = {-1, -2};
        System.out.println(smallestNum(b));
        int[] c = {2, 3, 4, 5};
        System.out.println(smallestNum(c));


    }
}

