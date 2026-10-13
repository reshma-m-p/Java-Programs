package org.MethodAssigment;

public class TestMethodOverridingCalculationMain {
    public static void main(String[] args) {
        TestMethodOverridingCalculationParent parent = new TestMethodOverridingCalculationParent();
        parent.getProduct();
        TestMethodOverridingCalculationChild child = new TestMethodOverridingCalculationChild();
        child.getSum();
        child.getProduct();
        child.getAverage();
        parent.getProduct();
        TestMethodOverridingCalculationParent obj = new TestMethodOverridingCalculationChild();
        obj.getProduct();
    }
}
