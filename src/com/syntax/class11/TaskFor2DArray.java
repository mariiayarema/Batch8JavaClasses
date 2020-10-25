package com.syntax.class11;

public class TaskFor2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [][] array= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"}

		};
		
		System.out.print(array[0][1]+ array[1][0] + ", ");
		System.out.print(array[0][0]+ array[1][3] + ", ");
		System.out.print(array[0][2]+ array[1][2] + ", ");
		System.out.print(array[0][3]+ array[1][1] + ". ");
		
		
	System.out.println();
	System.out.println("--------------");
		
	String[][] arrays= {
			{"Jeep", "Ford", "Dodge"},
			{"Audi", "Porsche", "BMW"},
			{"Kia", "Hyundai", "Hyundai sonata"},
			{"Ferrari", "Maserati", "Lamborghini"},
	};
		
	for (int i=2; i<3; i++) {
		for(int a=0; a<arrays[2].length; a++) {
			System.out.print(arrays[i][a] + ", ");
		}
	}
			
			System.out.println();
			System.out.println("-------------------------");
		//type[]+new name	 : //name
			for(String[] ar:arrays) {
				for(String car:ar) {
					System.out.print(car + ", ");
			}
			System.out.println();
			}
	
	

		
		
		
		
		
		
		
		
	}

}
