package com.syntax.class23;

public class AreaCalculator {
    /* Create 1 class in which create a method that will calculate the area (volume) of
       Rectangle
       Square
       Box
     */
    int length;
    int width;
    int height;

    public void area(int height){
        System.out.println("Area of this square is "+height*2);
    }
    public void area(int height,int length){
        System.out.println("Area of this rectangle is "+height*length);
    }
    public void area(int height,int length, int width){
        System.out.println("Area of this box is "+height*length*width);
    }

}
