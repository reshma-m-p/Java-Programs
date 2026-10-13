package org.JavaAssignments;

import java.util.Scanner;

public class SumOfDigits21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        System.out.println("Sum of digits: "+getSumOfDigits(scanner.nextInt()));
    }
    public static int getSumOfDigits(int number){
        int sum=0,mod;
        while (number!=0){
            mod=number%10;
            sum=sum+mod;
            number=number/10;
        }
        return sum;
    }
}
