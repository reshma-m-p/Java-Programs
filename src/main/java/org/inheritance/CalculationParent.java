package org.inheritance;

public class CalculationParent {
    static int num1 = 4, num2 = 5, sum = 0, prod = 1;

    public void sum() {
        sum = num1 + num2;
        System.out.println("sum from parent = " + sum);
    }

    public void product() {
        prod = num1 * num2;
        System.out.println("product from parent = " + prod);
    }
}
