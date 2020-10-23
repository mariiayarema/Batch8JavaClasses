package com.syntax.class08;

import java.util.Scanner;

public class LoopTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*While a program that reads a range of integers (start and
		 * end point), provided by a user and then from that range 
		 * prints the sum of the even and odd integers.
		 */
		
		
		Scanner scan;
		int start, end, num1 ;
		int result=0;
		int result2=0;
		scan=new Scanner(System.in);
		System.out.println("Please enter start poin");
		start=scan.nextInt();
		System.out.println("Please enter end point");
		end=scan.nextInt();
		
		if(start<end) {
		for(num1=start; num1<=end;num1++) {
			if(num1%2==0) {
				result+=num1;
			}else {
				result2+=num1;
			}
			
		}
		}else {
			for(num1=start; num1>=end;num1--) {
				if(num1%2==0) {
					result+=num1;
				}else {
					result2+=num1;
				}
				
			}
		}
		
		System.out.println(result);
		System.out.println(result2);
		
	}

}
