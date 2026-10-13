package org.JavaAssignments;

import java.util.Scanner;

public class Atm8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Check balance    2. withdrawal   3. Change pin");
        System.out.println("Enter the option:");
        int option = scanner.nextInt();
        getResult(option);
    }

    public static void getResult(int option) {
        switch (option) {
            case 1: {
                System.out.println("current balance is 10000");
                break;
            }
            case 2: {
                System.out.println("please collect the cash");
                break;
            }
            case 3: {
                System.out.println("Your pin number has been changed");
                break;
            }
            default: {
                System.out.println("invalid option");
            }
        }

    }
}
