package org.polymorphism;

public class OverridingExmChild extends OverridingExmParent {
    @Override
    public void myMethod() {
        System.out.println("Overriding method from child....");
    }

    public void ownMethod() {
        System.out.println("child own method from child..");
    }
}
