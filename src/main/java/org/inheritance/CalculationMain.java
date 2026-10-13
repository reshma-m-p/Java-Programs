package org.inheritance;

public class CalculationMain {
    public static void main(String[] args) {
        CalculationParent parent = new CalculationParent();
        parent.sum();
        CalculationChild child = new CalculationChild();
        child.sum();
        child.product();
        CalculationParent p=new CalculationChild();
        p.sum();
        p.product();
    }
}
