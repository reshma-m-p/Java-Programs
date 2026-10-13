package org.string;

import java.util.Locale;

public class TestStringMethods {
    public static void main(String[] args) {
        String string = new String("Hello world");
        System.out.println("Length of string: " + string.length());
        System.out.println("Character at index 0: " + string.charAt(0));
        System.out.println("Substring from index 1-7: " + string.substring(1, 7));
        String string1 = new String("Hello Team");
        String string2 = new String("Hello Team");
        System.out.println("Check Strings(Hello world and Hello Team) are equals: " + string.equals(string1));
        System.out.println("Check Strings(Hello Team and Hello Team) are equals: " + string2.equals(string1));
        System.out.println("Convert " + string + " to uppercase: " + string.toUpperCase());
        System.out.println("Convert " + string + " to lowercase: " + string.toLowerCase());
        String space = new String(" space ");
        System.out.println("Trim blank space from " + space + ":" + space.trim());
        System.out.println("Concatenate strings with concatenate: " + string.concat(string1));
        System.out.println("Concatenate strings with + : " + " hello " + " world");

    }
}
