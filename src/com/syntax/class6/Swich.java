package com.syntax.class6;

import java.util.Scanner;

public class Swich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Allow user to enter grade and then
		 * provide explanation: A-Excellent,
		 * B-Good, C-Average, D-Bad,
		 * any other grade --> 
		 * Not Acceptable. At the end your
		 * program should print which 
		 * grade was entered by a user with 
		 * explanation.
		 * 
		 */
		
		
		Scanner scan;
		char grade;
		String result;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade=scan.next().charAt(0);
		
		
		switch(grade) {
		
		case ('A'): 
			result="Exelent";
		    break;
		case ('B') :
			result="Good";
		    break;
		case('C'):
			result="Average";
		    break;
		case('D'):
			result="Bad";
		    break;
		 default:
			 result="Not Valid";
			 break;
			
		
		}
		
		System.out.println("Your grade is " + result);
		
			
	}

}
