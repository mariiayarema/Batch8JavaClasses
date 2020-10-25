package com.syntax.class11;

public class Task9 {

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
			
		}
		System.out.println(total);
		
	
		//for(String name:c) {
			//System.out.print(name + ". ");
		int totall=0;
		for(String []c:countries) {
		totall=totall+c.length;
		System.out.println(totall);
		}
		
	}

}
