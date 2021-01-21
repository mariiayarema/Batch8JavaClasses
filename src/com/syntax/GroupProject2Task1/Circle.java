package com.syntax.GroupProject2Task1;

public class Circle implements Shape{
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void calculateArea() {
        System.out.println("Circle area is "+Math.PI*(radius*radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Circle perimeter is "+ Math.PI*2*radius);
    }
}
