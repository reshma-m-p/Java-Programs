package org.JavaAssignments;

import java.util.Scanner;

public class MultiplicationTable15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        getMultiplicationTable(number);
    }

    public static void getMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + number + " = " + (i * number));
        }
    }
}
