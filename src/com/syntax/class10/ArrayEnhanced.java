package com.syntax.class10;

public class ArrayEnhanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] cars = {"Maserati", "Lamborgini", "Lexus", "Mercedes", "Infiniti", "Volkswagen"};
		for (int a = 0; a<cars.length; a++) {
			System.out.print(cars[a] + " ");
		}
		
		
		System.out.println();
		
		System.out.println("-------------getting value from array using enhanced for loop---------------");
		//enhanced loop ONLY WORK WITH ARRAY
		//left(type value i have) ; (name)right
		
		for(String name:cars) {
			System.out.print(name + " ");
		}
		
		
		
		
	}

}
