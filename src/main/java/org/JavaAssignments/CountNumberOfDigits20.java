package org.JavaAssignments;

import java.util.Scanner;

public class CountNumberOfDigits20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        System.out.println("Count of digits is " + getCountOfDigits(scanner.nextInt()));
    }

    public static int getCountOfDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}
