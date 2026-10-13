package org.conditional_statements;

import java.util.Scanner;

public class TestSwitchDay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day to check");
        int day=scanner.nextInt();
        String result=getDay(day);
        System.out.println(result);

    }
    public static String getDay(int day){
        String result;
       switch(day){
           case 1:{
               result="Sunday";
               break;
           }
           case 2:{
               result="Monday";
               break;
           }
           case 3:{
               result="Tuesday";
               break;
           }
           case 4:{
               result="Wednesday";
               break;
           }
           case 5:{
               result="Thursday";
               break;
           }
           case 6:{
               result="Friday";
               break;
           }
           case 7:{
               result="Saturday";
               break;
           }
           default:{
               result="invalid day";
           }

       }
       return result;
    }
}
