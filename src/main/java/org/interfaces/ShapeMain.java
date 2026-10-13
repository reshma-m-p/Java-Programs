package org.interfaces;

public class ShapeMain {
    public static void main(String[] args) {
        Shape rect = new RectangleArea();
        rect.area();
        Shape cir = new CirleArea();
        cir.area();
    }
}
