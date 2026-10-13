package org.abstraction;

import java.util.Scanner;

public  class TestAbstractMethodMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestAbstractMethodChild obj = new TestAbstractMethodChild();
        System.out.println("Enter numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("sum of numbers " + obj.GetSum(number1, number2));
        System.out.println("product of numbers " + obj.getProduct(number1, number2));
        System.out.println("Difference of numbers " + obj.GetDifference(number1, number2));
    }
}