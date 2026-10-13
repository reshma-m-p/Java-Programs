package org.arrays;

public class TestArrayForEach {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        System.out.println("Vowels are : ");
        for (char vowel : vowels) {
            System.out.print(vowel+" ");
        }
        System.out.println();
        int[] array = {2, 3, 4, 5, 6};
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Sum of array elements are: " + sum);
    }
}
