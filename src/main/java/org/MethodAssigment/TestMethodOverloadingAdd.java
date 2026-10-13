package org.MethodAssigment;

public class TestMethodOverloadingAdd {
    public void AddTest(int num1, int num2) {
        System.out.println("Sum of 2 int = " +( num1 + num2));
    }

    public void AddTest(int num1, double num2) {
        System.out.println("Sum of int and double = " + (num1 + num2));

    }

    public void AddTest(double num2, int num1) {
        System.out.println("Sum of double and int = " + (num1 + num2));

    }

    public void AddTest(int num2, int num1, int num3) {
        System.out.println("Sum of 3 int = " + (num1 + num2 + num3));

    }

}
