package com.syntax.class05;

import java.util.Scanner;

public class OrANDPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* If day is 1 or 5 --> i am of from Syntax,
		 * If day 2 or 3 --> I will have GIT classes,
		 * If day is 4 --> Review class,
		 * If 6 or 7 --> I will have Java class,
		 * everything else will be invalid day
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter todays day using numbers only");
		int today=scan.nextInt();
        
		if (today==1 || today==5 ) {
			System.out.println("I am off from Syntax");
		}else if (today==2 || today==3) {
			System.out.println("Today is GIT class");
		}else if (today==4) {
			System.out.println("Today is review class");
		}else if (today==6 || today==7) {
			System.out.println("Today is Java class");
		}else {
			System.out.println("Please enter a valid day from 1 to 7");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
