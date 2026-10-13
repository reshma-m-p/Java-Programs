package org.JavaAssignments;

import java.util.Scanner;

public class RemoveDuplicates34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int[] result = getNewArray(array);
        System.out.println("Array after duplicate removal..");
        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0)
                System.out.print(result[i] + " ");
        }
    }

    public static int[] getNewArray(int[] array) {
        int[] result = new int[array.length];
        int count = 0, d = 0, b = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            b = 0;
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    count++;
//                }
//            }
            for (int j = i; j >= 0; j--) {
                if (array[i] == array[j]) {
                    b++;
                }
            }
            if (b < 2) {
                result[d] = array[i];
                d++;
            }
        }
        return result;
    }
}
