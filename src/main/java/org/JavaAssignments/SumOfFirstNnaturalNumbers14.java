package org.JavaAssignments;

import java.util.Scanner;

public class SumOfFirstNnaturalNumbers14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number(N): ");
        System.out.println("Sum= " + getSumOfFirstNnaturalNumbers(scanner.nextInt()));
    }

    public static int getSumOfFirstNnaturalNumbers(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
