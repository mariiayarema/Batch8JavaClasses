package com.syntax.class04;

import java.util.Scanner;

public class ScannerHW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner dmv= new Scanner(System.in);
		System.out.println("How old are you");
		int age=dmv.nextInt();
		if (age>=18) {
			System.out.println("Your driver lisence will be issued");
		}else {
			System.out.println("Please get a learners permit");
		}
		
		
		
	}

}
