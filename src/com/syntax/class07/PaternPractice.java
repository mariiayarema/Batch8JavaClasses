package com.syntax.class07;

public class PaternPractice {

	public static void main(String[] args) {
	
		
		
		for(int row=1;row<5;row++) {
			for(int col=1;col<row;col++) {
				if(col==1||col==2||col==3) {
					System.out.print(" ");
				}else {
					System.out.println("*");
				}
				
			}
			System.out.println();
		}

	}

}
