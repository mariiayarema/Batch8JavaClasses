package com.syntax.class11;

public class TaskPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {10,0,20,8,-1,77,56};
	    int max=array[0];//assume that first number is the biggest;
		
		for(int i=1; i<array.length; i++ ) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("The largest number from an array is " + max);
		
		
	}

}
