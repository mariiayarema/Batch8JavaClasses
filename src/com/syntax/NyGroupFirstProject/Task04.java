package com.syntax.NyGroupFirstProject;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] array = { 9, 3, 13, -76, -45, -6, 0 };
		int max = array[0];
		int min = array[0];
		for (int num : array) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("The max number in the array is " + max);
		System.out.println("The min number in the array is " + min);
		
		
		
		
		
		
		
		
		
		
	}

}
