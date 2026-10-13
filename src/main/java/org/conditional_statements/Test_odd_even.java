package org.conditional_statements;

import java.util.Scanner;

public class Test_odd_even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
       findEvenOrOdd(num);
    }
    public  static void findEvenOrOdd(int num){
        if (num % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}