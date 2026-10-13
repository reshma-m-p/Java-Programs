package org.abstraction;

public class TestOddAbstractMain {
    public static void main(String[] args) {
        TestOddAbstractChild obj=new TestOddAbstractChild();
        System.out.println("List of odd between from 50 to 100 through abstraction");
        obj.getOddNumbers();
    }
}
