package com.syntax.class05;

import java.util.Scanner;

public class TestOrAnd3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		int quiz, mid, finalScore, avg;
		scan=new Scanner (System.in);
		 System.out.println("Please enter your quiz score ");
		 quiz=scan.nextInt();
		 System.out.println("Please enter your mid term score");
		 mid=scan.nextInt();
         System.out.println("Please enter your final score");
	     finalScore=scan.nextInt();
		 
		 avg=(quiz + mid + finalScore)/3;
		 
		if (avg>=90) {
			System.out.println("grade = A");
		}else if (avg>=70 && avg<90 ) {
			System.out.println("grade = B");
		}else if (avg>=50 && avg<70) {
			System.out.println("grade = C");
		}else if (avg>=40 && avg<50) {
			System.out.println("grade = D");
		}else {
			System.out.println("Grade = F");
		}
	    
		
		
		
		/* if you grade is A or B you are a good student and you are 
		 * study a lot
		 */
		
		
		
		
		
	}

}
