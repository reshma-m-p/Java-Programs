package org.inheritance;

public class CalculationChild extends CalculationParent {
    public void sum() {
        sum = num1 + num2 + prod;
        System.out.println("Sum from child class " + sum);
    }
}
