package org.arrays;

import java.util.Scanner;

public class TestMultiDimensionalArrayScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Row and Column:");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The array elements are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
