package org.JavaAssignments;

import java.util.Scanner;

public class ReverseAnArray29 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("Reversed array:");
        int[] result = getReversedArray(array);
        for (int i = 0; i < size; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public static int[] getReversedArray(int[] array) {
        int[] result = new int[array.length];
        int count = array.length-1;
        for (int i = 0; i < array.length - 1; i++) {
            result[count] = array[i];
            count--;
        }
        result[0] = array[array.length-1];
        return result;
    }
}
