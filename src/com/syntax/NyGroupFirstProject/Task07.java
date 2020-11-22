package com.syntax.NyGroupFirstProject;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { -9, -10, -11, -12 } };
		for (int[] arr : array) {
			for (int num : arr) {
				if (num % 2 == 0) {
					System.out.print(num + " ");
				}
			}
		}
			
	}

}
