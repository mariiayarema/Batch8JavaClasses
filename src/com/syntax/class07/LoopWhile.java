package com.syntax.class07;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int time=13;
		while (time>12) {
			System.out.println("good day");
			time--;
		}
		
		//i want to print numbers from 1 to 50
		
		System.out.println("Print numbers from 1 to 50");
		int num=1;
		
		while(num<51) {
			System.out.println(num);
			num++;
		}
		
		
		// //////////////////////////
		System.out.println("-----------------------");
		
		boolean workDay= true;
		int day=1;
		
		while(workDay) {
			if(day<6) {
			System.out.println("I need a day off");
			}else {
				System.out.println("It is weekend and I am off");
				
			}
			day++;
			workDay=false;
	}
		
	}

}
