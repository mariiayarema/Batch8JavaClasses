package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// We need to compare two numbers:
		//bigger, smaller or equal
		
		int num1=190;
		int num2=99;
		
		if (num1>num2) {//what if this condition is true
			System.out.println(num1 + "is bigger than" + num2);
		}else if (num1<num2) {//or what if this is true
			System.out.println(num1 + "is smaller than" +num2);
		}else {
			System.out.println(num1+ "is equal to" + num2);
		}
		
		System.out.println("-----------------------------------");
		
		/*Based on the day of the week we will print class schedule
		 * 
		 */
		
		int day=3;
		
		if(day==1) {
			System.out.println("Today is Monday we have no class.");
		} else if (day==2) {
			System.out.println("Today is Tuesday we have Manual class.");
	
		} else if (day==3) {
			System.out.println("Today is Wednesday and we have Manual class again.");
		} else if (day==4) {
			System.out.println("Today is Thursday and we have Review class.");
		} else if (day==5) {
			System.out.println("Today is Friday but i have a class tomorrow and i will prepare.");
		} else {
			System.out.println("This is invalid day.");
		}

		

		
	
		
		
		
	}

}
