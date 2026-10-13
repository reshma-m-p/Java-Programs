package org.Practice;

import org.interfaces.TestCat;

public class TestCloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        TestClone cloneob=new TestClone(30);
        TestClone clone1=(TestClone)cloneob.clone();
        System.out.println("Cloned object "+clone1.number);
    }
}
