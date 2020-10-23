package com.syntax.class09;

public class PatternsInLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* *****
 * *****
 * *****
 */
	
	//longgggg way	
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		
		System.out.println("----------------------");
		
	//better way
		
		for(int r =1; r<=4; r++) {
			for(int c=1; c<=6; c++ ) {
				System.out.print("*");
			}
			System.out.println();
			//creating line between lines
		}
		
		
		
	}

}
