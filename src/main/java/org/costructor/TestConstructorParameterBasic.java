package org.costructor;

public class TestConstructorParameterBasic {
    int param;

    public TestConstructorParameterBasic(int value) {
        param = value;
    }

    public static void main(String[] args) {
        TestConstructorParameterBasic basic = new TestConstructorParameterBasic(15);
        System.out.println("The value of parameter= " + basic.param);
    }
}
