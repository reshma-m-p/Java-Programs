package org.methods;

import java.util.Scanner;

public class TestMaxNumMethodsReturn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();   //num1 and num2 are actual parameters
        System.out.println("Max number using user defined method...." + getMaxUserDefined(num1, num2));
        System.out.println("Max number using system defined method...." + getMaxSystemDefined(num1, num2));
    }

    public static int getMaxUserDefined(int num1, int num2) {//num1 and num2 are formal parameters
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static int getMaxSystemDefined(int num1, int num2) {
        return Math.max(num1, num2);
    }
}
