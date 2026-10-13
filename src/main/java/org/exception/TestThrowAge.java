package org.exception;

import java.util.Scanner;

public class TestThrowAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        testAge(scanner.nextInt());
        System.out.println("Remaining code....");
    }

    public static void testAge(int age) {
        if (age < 18)
            throw new ArithmeticException("Access denied, under 18");
        else
            System.out.println("Access granted, above 18");
    }
}
