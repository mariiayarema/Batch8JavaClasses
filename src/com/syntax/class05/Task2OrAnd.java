package com.syntax.class05;

import java.util.Scanner;

public class Task2OrAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter day of the week by using number");
		int day=scan.nextInt();
		if(day>=1 && day<=5) {
			System.out.println("It is a week day");
		}else if(day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
		
	}

}
