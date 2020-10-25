package com.syntax.NYgroupTask;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int sum=0;
		int[][] array = { { 10, 20, 30 }, { 10, 20, 30 } };
		for (int[] arr : array) {
			for (int num : arr) {
				sum=sum+num;
			}
		}
		System.out.println("The sum of the numbers from 2D Array is "+sum);
	}

}
