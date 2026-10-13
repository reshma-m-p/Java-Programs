package org.JavaAssignments;

import java.util.Scanner;

public class CharacterVowerOrConsonantSwitch7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = scanner.nextLine().toLowerCase().charAt(0);
        checkVowelOrConsonant(ch);
    }

    public static void checkVowelOrConsonant(char charcter) {

        switch (charcter) {
            case 'a': {
                System.out.println(charcter + " is vowel.");
                break;
            }
            case 'e': {
                System.out.println(charcter + " is vowel.");
                break;
            }
            case 'i': {
                System.out.println(charcter + " is vowel.");
                break;
            }
            case 'o': {
                System.out.println(charcter + " is vowel.");
                break;
            }
            case 'u': {
                System.out.println(charcter + " is vowel.");
                break;
            }
            default: {
                System.out.println(charcter + " is consonant.");
                break;
            }
        }
    }
}
