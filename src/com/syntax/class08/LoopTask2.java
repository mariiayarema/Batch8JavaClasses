package com.syntax.class08;

import java.util.Scanner;

public class LoopTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*Create a program that will be asking user to apply
		 *for a credit cart 10 times. As soon you get an "yes" from
		 *a user program should stop asking
		 */

		Scanner scan;
		
		scan=new Scanner(System.in);
		boolean responce =false;

	     for(int num=1; num<=10; num++) {
			
			System.out.println("Would you like to apply for credit card");
			responce=scan.nextBoolean();
				if(responce=responce) {
					break;
				}
		
	     }
	
	     
	     
	     
	  
	     
	     
	     
	     
	     
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
