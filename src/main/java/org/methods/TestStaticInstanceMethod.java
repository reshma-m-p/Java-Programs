package org.methods;

import java.util.Scanner;

public class TestStaticInstanceMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Sum from static method " + getSum(number1, number2));
        TestStaticInstanceMethod obj = new TestStaticInstanceMethod();
        System.out.println("Difference from instance method " + obj.getDifference(number1, number2));

    }

    public static int getSum(int num1, int num2) {
        return (num1 + num2);
    }

    public int getDifference(int num1, int num2) {
        return (num1 - num2);
    }
}
