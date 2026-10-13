package org.loop;

import java.util.Scanner;

public class TestNestedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        /*for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }*/

       // System.out.println("Enter the number");
       // int number = scanner.nextInt();
       /* for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }*/

        for(int i=number;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }



    }
}
