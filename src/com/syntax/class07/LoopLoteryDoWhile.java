package com.syntax.class07;

import java.util.Scanner;

public class LoopLoteryDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*play a lottery where we need to enter number from 1 to 100
		 * lucky number is 7
		 * keep asking a user to enter a number until entered number 
		 * is same as lucky number
		 */
		Scanner scan;
		int numberFromUser;
		int luckyNumber=7;
		
		scan=new Scanner(System.in);
		do {
			System.out.println("Pleace enter any number from 1 to 100");
			numberFromUser=scan.nextInt();
			
		}while(numberFromUser!=luckyNumber);
		
		System.out.println("Its lucky number");
	}

}
