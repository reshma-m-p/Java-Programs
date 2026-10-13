package org.arrays;

public class TestMultiDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
        System.out.println("multidimensional array elements are");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
