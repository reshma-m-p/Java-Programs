package org.JavaAssignments;

import java.util.Scanner;

public class ArmstrongNumber18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        boolean result = checkArmstrongNumber(number);
        if (result == true)
            System.out.println(number + " is an armstrong number!");
        else
            System.out.println(number + " is not an armstrong number!");
    }

    public static boolean checkArmstrongNumber(int number) {
        int mod = 0, count = 0, original = number, original1 = number;
        double sum = 0.0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        while (original != 0) {
            mod = original % 10;
            sum = sum + Math.pow(mod, count);
            original = original / 10;
        }
        System.out.println(sum+ "sum");
        if (sum == original1)
            return true;
        else
            return false;
    }
}
