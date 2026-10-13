package org.MethodAssigment;

public class TestMethodOverloadingArea {
    public void GetArea(int radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    public void GetArea(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public void GetArea(int breadth, double height) {
        System.out.println("Area of Triangle:: " + (0.2 * breadth * height));
    }

    public void GetArea(double breadth, int height) {
        System.out.println("Area of Triangle: " + (0.2 * breadth * height));
    }
}
