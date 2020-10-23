package com.syntax.class08;

public class DoLoopSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// i want to see sum of odd and even numbers
		int num1;
		int sum=0;
		int sum2=0;
		
		for( num1=1; num1<=50; num1++) {
		if (num1%2==0) {
			sum+=num1;
			
		}else {
			sum2=sum2+num1;
			
		}

		}
		System.out.println(sum);
		System.out.print(sum2);
		
		
		
		
		
		
	}

}
