package org.arrays;

public class TestSimpleArray {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        System.out.println("Array elements are:");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("Array elements with for loop are:");
        for (int i=0;i<5;i++) {
            System.out.println(arr[i]);
        }
    }
}
