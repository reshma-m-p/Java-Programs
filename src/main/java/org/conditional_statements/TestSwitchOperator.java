package org.conditional_statements;

import java.util.Scanner;

public class TestSwitchOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println("Enter the operator");
        char operator=scanner.next().charAt(0);
        int result=getResult(num1,num2,operator);
        System.out.println("Result="+result);
    }
    public static int getResult(int num1,int num2,char operator){
        int result=0;
        switch (operator){
            case '+':{
                result=num1+num2;
                break;
            }
            case '-':{
                result=num1-num2;
                break;
            }
            case '*':{
                result=num1*num2;
                break;
            }
            case '/':{
                result=num1/num2;
                break;
            }
            case '%':{
                result=num1%num2;
                break;
            }
            default:{
                System.out.println("invalid operator");
            }
        }
        return result;
    }
}
