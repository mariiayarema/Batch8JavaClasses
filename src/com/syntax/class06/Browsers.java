package com.syntax.class06;

import java.util.Scanner;

public class Browsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*lets ask a tester which browser they would like to use
		 * 
		 * 
		 */
		
		Scanner scan;
		String browser;
		String message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter browser");
		browser=scan.nextLine();
		
		switch(browser.toLowerCase()) {
		
		case "safari":
			message="Your code will be executed on Safari browser";
		    break;
		case "chrome":
			message="You code will be executed on Chrome browser";
		    break;
		case "firefox":
			message="Your code will be executed on Firefox browser";
		    break;
	    default:
	    	message="Entered browser is not supported";
	        break;
		}
		
		System.out.println(message);
		
		
		
		
		
		
	}

}
