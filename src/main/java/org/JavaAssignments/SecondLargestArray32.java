package org.JavaAssignments;

import java.util.Scanner;

public class SecondLargestArray32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of array:");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Second largest element of array: " + getSecondLargest(array));
    }

    public static int getSecondLargest(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return (array[array.length-2]);
    }
}
