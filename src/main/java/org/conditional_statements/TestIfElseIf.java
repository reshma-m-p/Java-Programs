package org.conditional_statements;

import java.util.Scanner;

public class TestIfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the numbers ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        findLargest(a, b, c);
    }
    public static void  findLargest(int a, int b,int c){
        if((a>b) && (a>c)){
                System.out.println(a+" is the largest");
        } else if ((b>a)&&(b>c)) {
            System.out.println(b+" is the largest");
        }else {
            System.out.println(c+" is the largest");
        }
    }}

