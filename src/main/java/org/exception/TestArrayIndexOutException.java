package org.exception;

public class TestArrayIndexOutException {
    public static void main(String[] args) {
        getArrayIndexException();
        System.out.println("Remaining code from main");
    }

    public static void getArrayIndexException() {
        int[] array = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                array[i] = i;
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception occurred " + e);
        } finally {
            System.out.println("finally block");
        }
    }
}
