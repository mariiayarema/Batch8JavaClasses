package com.syntax.class08;

public class LoopTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Print number from 1 to 50
		 * exept those that are devided by 3
		 * 2 ways
		 */
		int num=1;
		
		
		while(num<=50) {
			if (num%3!=0)
			System.out.print(num + " ");
			num++;
			
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------");
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		
		
		
		
		
		
	}

}
