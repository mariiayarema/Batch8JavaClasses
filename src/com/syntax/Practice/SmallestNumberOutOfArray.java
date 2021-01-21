package com.syntax.Practice;

import org.apache.poi.hpsf.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestNumberOutOfArray {
    /*
    Write a method that will return the smallest number
    from an array. Conditions number should be greater
    than 0 and it should not be a part of the array
    Examples Arr=[1,2,3,4,6]=>5 Arr=[-1,-2]=>1 Arr=[2,3,4,5]=>1
     */
    public static int getSmallestNumOutOfArray(int[] arr) {
        Arrays.sort(arr);

        int min = 1;
        int length = arr.length - 1;
        int max = arr[length];

        Set<Integer> set = new HashSet<>();
        for (int a : arr) {
            if (a > 0) {
                set.add(a);

            }
        }
            for (int b = 1; b <= max; b++) {
                if (!set.contains(b)) {
                    min = b;
                    break;
                }
            }


        return min;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        System.out.println(getSmallestNumOutOfArray(arr));


    }

}



