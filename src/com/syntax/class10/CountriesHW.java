package com.syntax.class10;

public class CountriesHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ottawa;Male;Singapore;Lima; Valletta
		String [] countries= {"Canada","Maldives","Singapore","Peru","Malta"};
		String [] capital= {"Ottawa", "Male", "Singapore", "Lima", "Valletta"};
		
		for(int world=0; world<countries.length; world++) {
			System.out.print(countries[world] + "-");
			System.out.print(capital[world] + ".   ");
			
		}
System.out.println();		
System.out.println("-------------------------------------------------------------------------------------");

         String [] countries2= {"Canada","Maldives","Singapore","Peru","Malta"};
         String [] capital2= {"Ottawa", "Male", "Singapore", "Lima", "Valletta"};
      
		for(String w:countries2) {
			System.out.print(w + " ");
		}
		System.out.println();
		for(String world :capital2) {
				System.out.print(world+ " ");
			
			
			}
		}

		
		
		
		
	}

