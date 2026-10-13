package org.methods;

import java.util.Scanner;

public class TestMaxNumMethodWithRNoArg {
    public static void main(String[] args) {
        System.out.println("Max number using user defined method...." + getMaxUserDefined());
        System.out.println("Max number using system defined method...." + getMaxSystemDefined());
    }

    public static int getMaxUserDefined() {//num1 and num2 are formal parameters
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();   //num1 and num2 are actual parameters
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static int getMaxSystemDefined() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return Math.max(num1, num2);
    }
}

