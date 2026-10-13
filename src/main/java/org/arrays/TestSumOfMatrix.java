package org.arrays;

import java.util.Scanner;

public class TestSumOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        int row1 = scanner.nextInt();
        int column1 = scanner.nextInt();
        int[][] first = new int[row1][column1];
        System.out.println("Enter the first array elements");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                first[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns of second matrix");
        int row2 = scanner.nextInt();
        int column2 = scanner.nextInt();
        int[][] second = new int[row2][column2];
        System.out.println("Enter the second array elements");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                second[i][j] = scanner.nextInt();
            }
        }
        if ((row1 == row2) && (column1 == column2)) {
            getMatrixSum(first, second, row1, column1);
        } else
            System.out.println("Matrix addition is not possible");
    }

    public static void getMatrixSum(int[][] first, int[][] second, int row, int column) {
        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        System.out.println("Sum of Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
