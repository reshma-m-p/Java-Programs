package org.exception;

public class TestArithmeticExceptionHandled {
    static int number1 = 5, number2 = 0, div;

    public static void main(String[] args) {
        getResult();
        System.out.println("Remaining code from main");
    }

    public static void getResult() {
        try {
            div = number1 / number2;
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Arithmetic Exception, / zero");
        }
        getDiv();

    }

    public static void getDiv() {
        System.out.println("From Div method.....");
    }
}
