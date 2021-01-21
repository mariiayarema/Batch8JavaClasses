package com.syntax.Practice;
import java.util.*;




import java.util.Scanner;

public class Practice3 {
    /*
      Given an array nums of n integers, are there elements a, b, c in
      nums such that a + b + c = 0? Find all unique triplets in the array
      which gives the sum of zero.
    int[] num={-1 ,0, 1, 2, -1, -4};
 	System.out.print(triplets (num));
     */


    public static List<List<Integer>> triplets (int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int a = 0; a < nums.length; a++) {
            int b = a + 1;
            int c = nums.length - 1;
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            while (b < c) {
                if (c < nums.length - 1 && nums[c] == nums[c + 1]) {
                    c--;
                    continue;
                }
                if (nums[a] + nums[b] + nums[c] > 0) {
                    c--;
                } else if (nums[a] + nums[b] + nums[c] < 0) {
                    b++;
                } else {
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(nums[a]);
                    l.add(nums[b]);
                    l.add(nums[c]);
                    result.add(l);
                    b++;
                    c--;
                }
            }
        }

        return result;
    }


}