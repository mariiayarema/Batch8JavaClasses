package com.syntax.class6;

import java.util.Scanner;

public class HomeworkCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Scanner scan;	
	String country;	
	String language="invalid";
		
    scan=new Scanner(System.in);
    System.out.println("Please enter your country");
	country=scan.nextLine();
	
	
	switch(country) {
	
	case ("France"):
	    language="french";
	    break;
	
	case("Germany"):
		language="german";
	    break;
	case("Ukraine"):
		language="ukrainian";
	    break;
	case("USA"):
		language="english";
	    break;
	case("Spain"):
		language="spanish";
	    break;
	case("Italy"):
		language="italian";
	    break;
	default:
		System.out.println("Invalid country");
	    break;
	
	}
		
	
	System.out.println("You speak " + language + " language.");
	
	
		
		
		
	}

}
