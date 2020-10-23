package com.syntax.class10;

import java.util.Scanner;

public class DoubleHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Please enter the numbers of double value you want to enter");
		//int size=scan.nextInt();
		//double[]value=new double[size];
		//double sum=0;
		//System.out.println("Please enter the value you want to get sum ");
		
        // for(int i=0; i<size; i++) {
        //	 value[i]=scan.nextDouble();
		//	sum+=value[i];
		//}
		
		//System.out.println("The sum of entered numbers is" + value );
		double[] numbers= {23.4, 12.4, 3.4, 7.1, 8.5};
		double sum=0;
		for(int i=0; i<numbers.length; i++) {
			sum+=numbers[i];
			
		}
		System.out.println(sum);
		
		//---------------------------------------------------
		double suma=0;
		for(double a:numbers) {
			suma+=a;	
		}
		System.out.println(suma);
		
		
	}

}
