package com.syntax.GroupProject2Task1;

public class ShapeTester  {
    public static void main(String[] args) {
        Shape [] circle={new Circle(5.2),new Square(3.3)};
        for (Shape ss: circle) {
            ss.calculateArea();
            ss.calculatePerimeter();
        }
    }
}
