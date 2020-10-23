package com.syntax.class08;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print even numbers from 20 to 1 (2 ways)
		
		
		for(int num=20; num<=50; num++) {
			if(num%2!=0) {
				System.out.print(num + " " );
				
				
			}
		}
			System.out.println();
			System.out.println("---------------------------------");
		
		
		for(int n=21; n<=50; n+=2) {
			System.out.print(n + " ");
		}
		
		
		
	}

}
