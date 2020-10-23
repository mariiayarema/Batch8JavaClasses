package com.syntax.class08;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print even numbers from 20 to 1 (2 ways)
		
		for(int num=20; num>0; num--) {
			if(num%2==0) {
			System.out.print(num + " " );
		}
		}
		
		
		//--------------------------------------------
		
		int num=20;
		
		while(num>0) {
			if(num%2==0) {
				System.out.print(num + " ");
				num-=2;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
