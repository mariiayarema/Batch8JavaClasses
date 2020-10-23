package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String[] names= {"Mariia", "Dasha", "Marta", "Oleh", "Danilo"};
		System.out.println(names[0]);
		
		System.out.println("----------------------------------------");
		
		String[]name=new String[5];
		name[0]="Danilo";
		name[1]="Oleh";
		name[2]="Marta";
		name[3]="Dasha";
		name[3]="Mariia";
		
		
		System.out.println(name[3]);
		
		
		System.out.println("---------------------------------");
		
		//loop and array

		String[]nameS=new String[5];
		nameS[0]="Danilo";
		nameS[1]="Oleh";
		nameS[2]="Marta";
		nameS[3]="Dasha";
		nameS[3]="Mariia";
		int size=names.length;
		
		for(int i=0; i<nameS.length; i++) {
			System.out.println(nameS[i]);
		}
		
		
		
		
		
		
		
	}

}
