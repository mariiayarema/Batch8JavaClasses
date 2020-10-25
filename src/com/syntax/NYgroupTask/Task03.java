package com.syntax.NYgroupTask;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int j = 1;
		for (int i = 0; i < 30; i+=j) {
			j+=i;
			System.out.print(i+" ");
			System.out.print(j+" ");
		}
		System.out.println();	
		System.out.println("-----------------");
		
		
		
		int a = 0;
		int b = 1;
		int c;
		for (int i = 1; i <= 10; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		
		
	}

  }
}
