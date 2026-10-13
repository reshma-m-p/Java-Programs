package org.exception;

public class TestArithmeticExceptionNotHandled {
    static int number1 = 5, number2 = 0, div;

    public static void main(String[] args) {
        div = number1 / number2;
        System.out.println(div);
    }
}
