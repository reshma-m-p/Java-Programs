package org.exception;

public class TestThrowsArithmetic {
    public static void main(String[] args) {
        try {
            getDiv();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Caught Error");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Remaining code");
    }

    public static void getDiv() throws InterruptedException, ArithmeticException {
        int number1 = 10, number2 = 0, div;
        div = number1 / number2;
        Thread.sleep(1000);
        System.out.println("Hello code " + div);
    }

}
