package org.string;

import java.util.Scanner;

public class TestCountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String string = scanner.nextLine();
        string = string.toLowerCase();
        getVowelsConsonantsCount(string);
    }

    public static void getVowelsConsonantsCount(String string) {
        int consonants = 0, vowels = 0;
        char letter;
        for (int i = 0; i < string.length(); i++) {
            letter = string.charAt(i);
            if (letter == 'a'||letter == 'e'||letter == 'i'|| letter == 'o'|| letter == 'u'){
                vowels++;
            }
            else if (letter >= 'a' && letter <= 'z') {
                consonants++;
            }

        }
        System.out.println("Count of vowels in "+string+" is "+vowels);
        System.out.println("Count of consonants in "+string+" is "+consonants);
    }
}
