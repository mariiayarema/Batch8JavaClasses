package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean allergy=true;
		boolean peanutAlergy=true;
		boolean petAlergy=true;
		boolean pollenAlergy=false;
		
		if (allergy) {
			System.out.println("Lets do furter chech");
			if (petAlergy) {
				System.out.println("Pls no home pets");
			}
			
			
		}else {
			System.out.println("You are lucky");
		}
		
		
	}

}
