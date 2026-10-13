package org.interfaces;

public class CirleArea implements Shape{
    @Override
    public void area() {
        System.out.println("Area of circle is "+(3.14*2*2));
    }
}
