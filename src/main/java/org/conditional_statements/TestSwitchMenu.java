package org.conditional_statements;

import java.util.Scanner;

public class TestSwitchMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the option:");
        getMenu(scanner.nextInt());
    }

    public static void getMenu(int option) {
        switch (option) {
            case 1: {
                System.out.println("Say Hello....");
                break;
            }
            case 2: {
                System.out.println("Say Bye....");
                break;
            }
            case 3: {
                System.out.println("Exit....");
                break;
            }
            default: {
                System.out.println("invalid option..");
            }

        }
    }
}
