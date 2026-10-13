package org.loop;

import java.util.Scanner;

public class TestNestedForLoopPattern1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=scanner.nextInt();
        for (int i=1;i<=rows+1;i++){
            for(int j=i;j<=i;j++){
                if(j%2!=0){
                System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
