package org.abstraction;

public class ShapeMain {
    public static void main(String[] args) {
        Shape cir = new Circle();
        cir.draw();
        Shape rect = new Rectangle();
        rect.draw();
    }
}
