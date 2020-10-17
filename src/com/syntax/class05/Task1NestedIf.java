package com.syntax.class05;

import java.util.Scanner;

public class Task1NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan;
		double balance; 
		boolean credit;
		
	    scan=new Scanner(System.in);
		System.out.println("Can yo please tell if you have any credit card or no");
	    credit=scan.nextBoolean();
		if (credit) {
			System.out.println("What is the balance in your card");
		balance=scan.nextDouble();
			if(balance>1000) {
				System.out.println("Please pay immediately");
			}else {
				System.out.println("You can spend more $$$");
			}
		}else {
			System.out.println("Would you like to create one?");
		}
		
	}

}
