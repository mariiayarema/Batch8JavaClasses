package com.syntax.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//shorter way of array
		
		String[]names= {"Mike", "Burju", "Jack", "Danilo", "Bryan"};
		
		//we can't reasign names later;
		System.out.println(names[3]);
		
		
		//how do i know how many names i have
		int size=names.length;
		System.out.println("Size of names array = " + size);
		
		
		char[] grades= {'A', 'B', 'C', 'D', 'F'};
				System.out.println(grades[1]);
		
		
		
	}

}
