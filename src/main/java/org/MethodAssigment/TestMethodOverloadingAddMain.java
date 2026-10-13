package org.MethodAssigment;

public class TestMethodOverloadingAddMain {
    public static void main(String[] args) {
        TestMethodOverloadingAdd obj = new TestMethodOverloadingAdd();
        obj.AddTest(10, 20);
        obj.AddTest(10.5, 20);
        obj.AddTest(10, 20.5);
        obj.AddTest(10, 20, 20);
        obj.AddTest(50,50);
    }
}
