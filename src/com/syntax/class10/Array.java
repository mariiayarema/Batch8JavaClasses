package com.syntax.class10;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//i have 5 students in the class and i need to calculate the average score;
		
		int[] grades=new int[5]; //int[5]-i need to store 5 value
		grades [0]=98;
		grades[1]=80;
		grades[2]=89;
		grades[3]=67;
		grades[4]=77;
		
		double average=(grades[0] + grades[1] +grades[2] + grades[3]+grades[4])/5;
		
		System.out.println("Average score of my students =" + average);
		
		
System.out.println("-------------------");
		
		int a=10;
		int b;
		b=10;
		
		double[] array;
		array=new double[3];
		array[0]=12.99;
		array[1]=10.89;
		array[2]=5.99;
		System.out.println("value of last elementarray " +array[2]);
		
		
	}

}
