package org.methods;

import java.util.Scanner;

public class TestMaxNumMethods {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        getMaxUserDefined(num1,num2);
        getMaxSystemDefined(num1,num2);
    }
    public static void getMaxUserDefined(int num1,int num2){
        if(num1>num2)
            System.out.println("Max number using user defined method...."+num1);
        else
            System.out.println("Max number using user defined method.... "+num2);

    }
    public static void getMaxSystemDefined(int num1,int num2){
        System.out.println("Max number using system defined method...."+Math.max(num1,num2));
    }
}
