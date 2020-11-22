package com.syntax.class21;

public class CircleClass extends ShapeClass {

    CircleClass(int radius) {
        super(radius);
    }
        void circleArea () {
        double area=super.getP() * (super.getradius() * super.getradius());
            System.out.println("The area of circle is " + area);
        }
        
    public static void main(String[] args) {
        CircleClass circleClass=new CircleClass(1);
        circleClass.circleArea();
    }
}
