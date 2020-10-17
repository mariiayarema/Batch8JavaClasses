package com.syntax.class05;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner (System.in);
		System.out.println("Please enter 3 numbers");
		double num1, num2, num3;
		double biggest=0;
		num1=scanner.nextDouble();
		num2=scanner.nextDouble();
		num3=scanner.nextDouble();
	
	
		if (num1>num2) {
			if (num1>num3) {
				biggest=num1;
			}
		}else if (num2>num3) {
			if(num2>num1) {
				biggest=num2;
			}
		}else if (num3>num2) {
			if(num3>num1)
			biggest=num3;
		}
		
		
		
		else {
			System.out.println("Numbers are equal");
		}
			
			
			

		System.out.println(biggest);
		
			
			
			
			
			
			
			
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
