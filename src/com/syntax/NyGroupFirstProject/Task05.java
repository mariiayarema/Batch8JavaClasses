package com.syntax.NyGroupFirstProject;

import java.util.Arrays;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { -9, -3, -13, -76, -45, -6, 10 };
		int max = array[0];
		int min = array[0];
		int max2 = array[0];
		for (int num : array) {
			if (num > max) {
				max2 = max;
				max = num;
			}
			if (num > max2 && num != max) {
				max2 = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("The max number in the array is " + max);
		System.out.println("The second max number in the array is " + max2);
		System.out.println("The min number in the array is " + min);

		
		System.out.println();
		System.out.println("--------------------------------------------------");
		
		
		double[] num1 = {1,5,3,6};
		int length=num1.length;
		Arrays.sort(num1);
		System.out.println("Second highest number is "+num1[length-2]);
		
		
		
		
		
		
		
		
	}

}
