package org.JavaAssignments;

import java.util.Scanner;

public class ElectricityBill4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int unit= scanner.nextInt();
        double result=0;
        if(unit<=100)
            result=unit*1;
        else if(unit<=200)
            result=100*1+(unit-100)*2;
        else
            result=100*1+100*2+(unit-200)*3;
        System.out.println("bill : "+result);
    }
}
