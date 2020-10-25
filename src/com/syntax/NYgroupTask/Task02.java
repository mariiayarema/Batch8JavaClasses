package com.syntax.NYgroupTask;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =31;
		boolean flag = true;
		if (num > 1) {// prime number should be greater than 1
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}

		} else {
			flag = false;
		}
		System.out.println("Is number " + num + " a prime number? " + flag);

		
		}

}
