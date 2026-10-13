package org.JavaAssignments;

import java.util.Scanner;

public class FibonacciSeries19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        getFibonacciSeries(scanner.nextInt());
    }

    public static void getFibonacciSeries(int number) {
        int num1 = 1, num = 0, sum = 0;
        System.out.println(num);
        System.out.println(num1);
        for (int i = 1; i <= number - 2; i++) {
            sum = num + num1;
            System.out.println(sum);
            num = num1;
            num1 = sum;


        }
    }
}
