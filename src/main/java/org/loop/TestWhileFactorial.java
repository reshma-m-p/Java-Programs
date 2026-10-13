package org.loop;

import java.util.Scanner;

public class TestWhileFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int result = getResult(number);
        System.out.println("Factorial is " + result);
    }

    public static int getResult(int number) {
        int result = 1;
        while (number >= 1) {
            result = result * number;
            number--;
        }
        return result;
    }
}