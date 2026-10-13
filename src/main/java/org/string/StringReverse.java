package org.string;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to reverse: ");
        String string = scanner.nextLine();
        System.out.println("Reverse of the string is " + getReverseString(string));
    }

    public static String getReverseString(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        return reverse;
    }
}
/*
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = scanner.nextLine();
        StringBuilder rev=new StringBuilder(string).reverse();
        System.out.println("Reverse of "+string+" using string builder is "+rev);
        System.out.println("Reverse of the string is " + getReverse(string));
    }

    public static String getReverse(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        return reverse;
    }
 */