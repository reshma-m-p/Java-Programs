package org.MethodAssigment;

public class TestMethodOverloadingAreaMain {
    public static void main(String[] args) {
        TestMethodOverloadingArea area = new TestMethodOverloadingArea();
        area.GetArea(2);
        area.GetArea(4, 5);
        area.GetArea(1, 7.5);
        area.GetArea(7.5, 1);
    }
}
