package com.syntax.class06;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		double num1, num2;
		double result=0;
		char operator;
		
		
	 scan=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		System.out.println("Please enter an operator you woud like to use +,-,*,/");
		operator=scan.next().charAt(0);
		
		switch(operator) {
		case('+'):
			result=num1+num2;
			break;
		case('-'):
			result=num1-num2;
		    break;
		case ('*'):
			result=num1*num2;
		    break;
		case ('/'):
			result=num1/2;
		    break;
		default :
			System.out.println("Invalid operator");
			break;
		}
		
		 if(operator=='+' || operator=='-' || operator=='*' || operator=='/') {
			 System.out.println("The " + operator + " of two numbers is " + result);
				
		 }
			
			
		
		
		
		
		
		
	}

}
