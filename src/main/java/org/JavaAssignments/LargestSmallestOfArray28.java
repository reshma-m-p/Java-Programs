package org.JavaAssignments;

import java.util.Scanner;

public class LargestSmallestOfArray28 {
    public static void main(String[] args) {
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of array:");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            temp = 0;
            for (int j = 0; j < size; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Smallest element of the array is " + array[0]);
        System.out.println("Largest element of the array is " + array[size-1]);
    }
}
