package org.JavaAssignments;

import java.util.Scanner;

public class MergeArray33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array 1:");
        int size1 = scanner.nextInt();
        int[] first = new int[size1];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size1; i++) {
            first[i] = scanner.nextInt();
        }
        System.out.println("Enter the size of array 2:");
        int size2 = scanner.nextInt();
        int[] second = new int[size2];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size2; i++) {
            second[i] = scanner.nextInt();
        }
        int[] third = new int[size1 + size2];
        System.out.println(third.length);
        for (int i = 0; i < size1; i++) {
            third[i] = first[i];
        }
        int j=0;
        for (int i = size1; i < third.length; i++) {
            third[i] = second[j];
            j++;
        }
        System.out.println("merged array..");
        for (int i = 0; i < third.length; i++) {
            System.out.print(third[i] + " ");
        }
    }
}
