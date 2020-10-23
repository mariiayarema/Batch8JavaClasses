package com.syntax.class06;

import java.util.Scanner;

public class NotOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter day of the week using numbers");
		int day=scanner.nextInt();
		String today ;
		
		switch (day) {
		case 1:
			today="Monday";
			break;
		case 2:
			today="Tuesday";
		    break;
		case 3:
			today="Wednesday";
		    break;
		}
		
		
	}

}
