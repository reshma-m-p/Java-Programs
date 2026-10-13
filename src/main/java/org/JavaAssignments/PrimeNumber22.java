package org.JavaAssignments;

import java.util.Scanner;

public class PrimeNumber22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int number = scanner.nextInt();
        int result = checkPrime(number);
        if (result > 2)
            System.out.println(number + " is not prime");
        else
            System.out.println(number + " is prime");
    }

    public static int checkPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }
        return count;
    }
}
