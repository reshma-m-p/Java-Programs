package org.conditional_statements;

import java.util.Scanner;

public class TestLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        isLeapYear(year);
    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}

