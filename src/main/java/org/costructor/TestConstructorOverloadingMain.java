package org.costructor;

public class TestConstructorOverloadingMain {
    public static void main(String[] args) {
        TestConstructorOverloading constr = new TestConstructorOverloading(10, 20);
        System.out.println("The value of number1 and number2 of constr is " + constr.number1 + " and " + constr.number2+" respectively.");
        TestConstructorOverloading seccons = new TestConstructorOverloading(10, 20, 70);
        seccons.getSum();
    }
}
