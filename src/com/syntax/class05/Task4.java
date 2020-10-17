package com.syntax.class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your bith month");
		int m=scan.nextInt();
		if (m==1 || m==2 || m==12)		 {
			System.out.println("You were born at winter time");
		} else if (m==3 || m==4 || m==5) {
			System.out.println("You were born at spring time");
		} else if (m==6 || m==7 || m==8) {
			System.out.println("You were born at summer time ");
		} else if (m==9 || m==10 || m==11) {
			System.out.println("You were born at fall time");
		} else {
			System.out.println("Invalid month");
		}
		
		
		
		
		
		
		
	}

}
