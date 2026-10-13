package org.JavaAssignments;

import java.util.Scanner;

public class secondLargest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Three numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("The second largest is " + getSecondLargest(number1, number2, number3));

    }

    public static int getSecondLargest(int number1, int number2, int number3) {
        int largest = 0, second = 0;
        if ((number1 > number2 && number2 > number3)||(number1 < number2 && number2 < number3)) {
            second = number2;
        } else if ((number2 > number1 && number1 > number3)||(number2 < number1 && number1 < number3)) {
            second=number1;}
        else
            second = number3;
        return second;
    }
}
