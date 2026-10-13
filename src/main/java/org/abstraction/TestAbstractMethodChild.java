package org.abstraction;

import java.util.Scanner;

public class TestAbstractMethodChild extends TestAbstractMethodParent {
    public int GetSum(int number1, int number2) {
        return number1 + number2;
    }

    public int getProduct(int number1, int number2) {
        return number1 * number2;
    }

}
