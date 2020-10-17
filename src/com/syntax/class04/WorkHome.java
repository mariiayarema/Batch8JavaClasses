package com.syntax.class04;

import java.util.Scanner;

public class WorkHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Create a Java program that will ask user to input city
		 * and temperature. Your program should convert
		 * Fahrenheit into celsius and print “The temperature
		 * is the city __ is __”
		 * 
		 * 
		 * 
		 */
		
		Scanner b=new Scanner(System.in);
		System.out.println("Please enter the name of city");
		String city=b.nextLine();
		System.out.println("Please enter your city temperature in Fahrenheit");
		int tem=b.nextInt();
		System.out.println("The temperature in the city " + city + " is " + tem + " Fahrenheit" + " or " + (tem-32)*5/9 + " Celcium.");
		
		
		
		
		
	}

}
