package com.syntax.class06;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan;
		  int int1, int2;
		  String word1, word2;
		  String output="Hi";
		  scan=new Scanner(System.in);
		  System.out.println("Please enter 2 numbers");
		  int1=scan.nextInt();
		  int2=scan.nextInt();
		  System.out.println("Please enter two words");
		  word1=scan.nextLine();
		  word2=scan.nextLine();
		  
		  if(int1==int2 && word1.equals(word2)) {
		    output="AND";
		  }else if(int1==int2 || word1.equals(word2)) {
		    output="OR";
		  }else if (!(int1==int2) && !(word1.equals(word2))) {
		    output="NONE";
		  }
		  
		  System.out.println(output);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
