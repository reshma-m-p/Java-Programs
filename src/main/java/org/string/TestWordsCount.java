package org.string;

import java.util.Scanner;

public class TestWordsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String string = scanner.nextLine();
       // String[] words = string.trim().split("[,\\s]");
        String[] words=string.trim().split("\\s");
        System.out.println("Word count of " + string + " is " + words.length);
        for (String str : words) {
            System.out.println(str);
        }

    }
}
