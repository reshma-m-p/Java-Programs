package org.arrays;

import java.util.Scanner;

public class TestSumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        getSum(array);
    }

    public static void getSum(int[] array) {
        int sum = 0, average = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of array is: " + sum);
        System.out.println("Average of array elements: " + (sum / array.length));
    }
}
