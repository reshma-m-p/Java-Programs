package org.costructor;

public class TestConstructorOverloading {
    int number1, number2, number3, sum;

    public TestConstructorOverloading(int value1, int value2, int value3) {
        number1 = value1;
        number2 = value2;
        number3 = value3;
    }

    public TestConstructorOverloading(int value1, int value2) {
        number1 = value1;
        number2 = value2;
    }

    public void getSum() {
        System.out.println("The Sum is= " + (number1 + number2 + number3));
    }
}
