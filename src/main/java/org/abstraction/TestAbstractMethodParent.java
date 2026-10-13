package org.abstraction;

public abstract class TestAbstractMethodParent {
    public abstract int GetSum(int number1, int number2);

    public int GetDifference(int number1, int number2) {
        return number1 - number2;
    }

}
