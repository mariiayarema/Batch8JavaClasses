package com.syntax.class05;

import java.util.Scanner;

public class TaskOrAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Pleace enter heihts in inches");
		int h=scan.nextInt();
		if (h<60) {
			System.out.println("You are short");
		}else if (h>60 && h<72) {
			System.out.println("You are medium");
		}else if (h>72) {
			System.out.println("You are tall");
		}
		
		
		
		
		
		
		
		
	}

}
