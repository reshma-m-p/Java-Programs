package org.JavaAssignments;

import java.util.Scanner;

public class CountEvenOddInArray30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        getCount(array);
    }

    public static void getCount(int[] array) {
        int even = 0, odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Count of even numbers = " + even + ", Count of odd numbers = " + odd);
    }
}
