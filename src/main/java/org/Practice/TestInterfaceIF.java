package org.Practice;

public interface TestInterfaceIF {
    public void testInterface();
    int no=10;
    default void getInterface(){
        System.out.println("default method from interface");
    }
}
