package com.syntax.class04;

import java.util.Scanner;

public class ScannerHW {

	
	
	
	
	
	public static void main(String [] args) {
		  

	boolean isSunny=true;
		 
		  
		  Scanner u=new Scanner (System.in);
		  System.out.println("Is it sunny outside?");
		  boolean s=u.nextBoolean();
		  if (isSunny) {
		    System.out.println("It is sunny day, I should go somewhere!");
		    System.out.println("What is the temperature outside?");
		    int m=u.nextInt();
		     if (m>85) {

		      System.out.println("I am going to the beach!");
		    }else  {
		      System.out.println("I am going to the park");
		    }
		    
		  }else {
			  System.out.println("Im gonna stay");
		  }
		  
		  
		  
		  
		  
		 }
		}
	
	
	
	
	
	
	


