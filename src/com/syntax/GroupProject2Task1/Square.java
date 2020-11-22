package com.syntax.GroupProject2Task1;

public class Square implements Shape {
    private double length;

    Square(double length){
        this.length=length;
    }
    @Override
    public void calculateArea() {
        System.out.println("Square area is "+length*length);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Square perimeter is "+4*length);
    }
}
