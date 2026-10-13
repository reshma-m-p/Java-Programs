package org.polymorphism;

public class OverridingExmMain {
    public static void main(String[] args) {
        OverridingExmParent parent=new OverridingExmParent();
        parent.myMethod();
        OverridingExmParent child=new OverridingExmChild();
        child.myMethod();
        OverridingExmChild c=new OverridingExmChild();
        c.ownMethod();
    }
}
