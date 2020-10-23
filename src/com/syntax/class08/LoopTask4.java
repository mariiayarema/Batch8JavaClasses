package com.syntax.class08;

import java.util.Scanner;

public class LoopTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Write a program to ask a user to enter item they
		 * want to buy and the price of that item. Every time
		 * user enters money accumulate the amount and tell the 
		 * user how much is left to pay off. If user give more 
		 * money program should return a change. Whenever a user
		 * done with payments program should say "Thank you for 
		 * shopping!"
		 */
		
	Scanner scan;
	String item;
	int price, payment;
	
	
	scan=new Scanner(System.in)	;
	System.out.println("Please enter item you want to by");
	item=scan.nextLine();
	System.out.println("Please enter price of item");
	price=scan.nextInt();
	
	while(price==price) {
		System.out.println("Please pay");
		payment=scan.nextInt();
		
		if(payment!=price) {
			System.out.println("Your change " + (payment-price));
			break;
		}else {
			System.out.println("Thank you for shoping");
			break;
		}
	}
		
		
		
		
		
		
		
	}

}
