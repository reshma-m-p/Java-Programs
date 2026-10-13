package org.loop;

public class TestSimpleDoWhile {
    public static void main(String[] args) {
        int number=1,num=10;
        do{
            System.out.println(number);
            number++;
        }while(number<=10);

        System.out.println("\nDecreasing order");
        do{
            System.out.print(num+" ");
            num--;
        }while(num>=1);
    }
}
