package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int salary;
		int years;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter numbers of worker years");
			years=scan.nextInt();
			if (years>=5) {
				System.out.println("User is eligible for the bonus");
				System.out.println("Enter your anual salary");
				salary=scan.nextInt();
				if (salary>50000) {
					System.out.println("Your bonus is 5000");
				}else {
					System.out.println("Your bonus is 3000");
				}
			}else {
				System.out.println("User is not eligible for bonus");
			}
		
		
		
		
		
		
	}

}
