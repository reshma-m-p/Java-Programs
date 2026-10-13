package org.arrays;

public class TestSimpleArrayDynamic {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 7;
        array[2] = 11;
        System.out.println("Array elements are");
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
        String[] str = new String[3];
        str[0] = "Anu";
        str[1] = "Manu";
        str[2] = "Vinu";
        System.out.println("String Array elements are");
        for (int i = 0; i < 3; i++) {
            System.out.println(str[i]);
        }
    }
}
