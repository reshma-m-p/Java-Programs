package org.polymorphism;

public class DisplayOverLoading {
    public void display(char c) {
        System.out.println("character is " + c);
    }

    public void display(char c, int n) {
        System.out.println("character is " + c + " and number is " + n);
    }
}
