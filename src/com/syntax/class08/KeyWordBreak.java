package com.syntax.class08;

public class KeyWordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//break; - 1ill break your loop
		
		for(int i=1; i<4; i++) {
			System.out.println("Hello");
			break;
		}
		
		System.out.println();
		System.out.println("---------------------");
		
		//we want to print numbers from 1to 10
		//when num is 5 we want to break
		
		
		for(int i=1; i<=10; i++) {
			
			if (i==5) {
				break;
				
			}
			System.out.println(i);
		}

	}
	

}
