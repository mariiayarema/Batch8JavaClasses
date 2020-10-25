package com.syntax.class11;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//new char [how many rows] [how many columns];
		
		char [] [] $array =new char [3][4];
		
		//add value to first raw
		
		$array[0][0]='A';
		$array[0][1]='B';
		$array[0][2]='C';
		$array[0][3]='D';
		
		
		//2nd raw
		$array[1][0]='W';
		$array[1][1]='X';
		$array[1][2]='Y';
		$array[1][3]='Z';
		
		//3rd row
		$array[2][0]='Q';
		$array[2][1]='W';
		$array[2][2]='B';
		$array[2][3]='R';
		
		System.out.println($array [1] [3]);// i would like to print Z
		
		System.out.println();
		System.out.println("---------------------Another way--------------------------------------------");
		
		int [][] array= {
				{10,20,30},
				{1,2,3},
				{100,200,300}
			
		};
		System.out.println(array [2][1]); //I want to print 200
		System.out.println(array [0][0]); //I want to print 10
	
		//How can we print all values from an array
		System.out.println("The size of array of integers= "+array.length);

	
		
		
		
		
		
		
		
	}

}
