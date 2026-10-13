package org.JavaAssignments;

import java.util.Scanner;

public class NumberPalindrome3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        checkPalindrome(scanner.nextInt());
    }

    public static void checkPalindrome(int number) {
        int reverse = 0, mod, original = number;
        while (number != 0) {
            mod = number % 10;
            reverse = (reverse * 10) + (mod);
            number = number / 10;

        }
        if (original == reverse)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
    }
}
