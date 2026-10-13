package org.arrays;

import java.util.Scanner;

public class TestArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Sorted array: ");
        int[] result = getSortedArray(array);
        for (int i = 0; i < size; i++) {
            System.out.println(result[i]);
        }

    }

    public static int[] getSortedArray(int[] array) {

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
