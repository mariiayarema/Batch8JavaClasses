package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0; i<3; i++) {
			System.out.println("Hello," + " ");
			for(int y=0; y<3; y++) {
				System.out.println("Bye," + " ");
			}
		}
		
		System.out.println("-----------More examples-----------");
		
		for(int i=10; i<=14; i++) {
			System.out.println(i);
			for(int j=1; j<=4; j++) {
				System.out.println(j);
			}
		}
		
		System.out.println("----------------numbers from 1 to 99--------------------");
		
		for(int i=1; i<=9; i++) {
			for(int j=0; j<=9; j++) {
				System.out.println(i + "" + j);
			}
		}
		
		System.out.println("------------clock--------------");
		
		for(int h=0; h<24; h++) {
			
			for(int m=0; m<60; m++) {
				if(h<10) {
					if(m<10) {
						System.out.println("0" +h + ":0" + m);
					}else {
						System.out.println("0" + h + ":" + m);
					}
					
				}else {
					System.out.println(h + ":" + m);
				}
				
				
			}
		}
		
		
		
	}

}
