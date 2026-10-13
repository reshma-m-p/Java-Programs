package org.conditional_statements;
import java.util.Scanner;

public class Test_Positive_negative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }

    }
}