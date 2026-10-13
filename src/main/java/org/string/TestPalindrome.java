package org.string;

import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String string = scanner.nextLine();
    String reverse= getReverse(string);
    if(string.equalsIgnoreCase(reverse))
        System.out.println(string+" is palindrome");
    else
        System.out.println(string+" is not palindrome");
}

    public static String getReverse(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        return reverse;
    }

}
