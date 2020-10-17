package com.syntax.class04;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter boolean value for rain");
		
		boolean rain=input.nextBoolean();
		if(rain) {
			System.out.println("Pls take an umbrella");
		}else {
			System.out.println("It is nice weather, go for a walk");
		}
		
		
		
		
	}

}
