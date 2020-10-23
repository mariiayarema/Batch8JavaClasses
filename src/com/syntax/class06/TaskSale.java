package com.syntax.class06;

import java.util.Scanner;

public class TaskSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner scanner=new Scanner(System.in);
		boolean storeSale;
		double price;
		double discount;
		System.out.println("Does store have sale today");
		storeSale=scanner.nextBoolean();
		
		if(storeSale) {
			System.out.println("What is the price");
			price=scanner.nextDouble();
			if(price >10 && price<50) {
			discount=price*0.1;
			}else if (price>50 && price<100) {
			discount=price*0.2;	
			}else if (price>100 && price<500) {
		    discount=price*0.4;
			}else if (price>=500) {
				discount=price*0.5;
			}else {
				discount=0;
			}
			
			System.out.println("Your final price will be " + discount);
		}else {
			System.out.println("No shopping");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
