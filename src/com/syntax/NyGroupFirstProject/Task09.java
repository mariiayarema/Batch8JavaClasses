package com.syntax.NyGroupFirstProject;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String [][] countries= {
				{"USA", "Canada", "Mexico", "Cuba"},
				{"Brazil", "Argentina", "Colombia", "Peru"},
				{"Ukraine", "Italy","France"},
				{"Japan", "Indonesia", "China", "India"},
				{"Nigeria", "Kenya", "Ethiopia"}
				
		};
		int total=0;
		for(int i=0; i<countries.length; i++) {
			
			total=total+countries[i].length;

			for(int j=0; j<countries[i].length; j++ ) {
				System.out.print(countries[i][j] + ". ");
								
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Total number of countries that has been stored is "  + total);
		
	System.out.println();
	System.out.println("--------------different loop--------------");
		
	    int sum=0;
		for(String []c:countries) {
			
			sum=sum+c.length;
			
			for(String name:c) {
				System.out.print(name + ". ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Total number of countries that has been stored is "  + sum);

	}

}
