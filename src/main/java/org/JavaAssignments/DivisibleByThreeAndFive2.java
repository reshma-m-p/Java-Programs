package org.JavaAssignments;

import java.util.Scanner;

public class DivisibleByThreeAndFive2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        checkDivisible(scanner.nextInt());
    }

    public static void checkDivisible(int number) {
        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("The number is divisible by both 3 and 5");
        else
            System.out.println("The number is not divisible by both 3 and 5");
    }
}
