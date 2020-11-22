package com.syntax.GroupProject2Task1;

public class ShapeTester  {
    public static void main(String[] args) {
        Shape circle=new Circle(5.2);
        circle.calculateArea();
        circle.calculatePerimeter();
        Shape square=new Square(3.3);
        square.calculatePerimeter();
        square.calculateArea();
    }
}
