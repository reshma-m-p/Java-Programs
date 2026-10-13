package org.MethodAssigment;

public class TestMethodOverridingCalculationChild extends TestMethodOverridingCalculationParent{
    double sum=0;

    public void getSum(){
        number1=20;
        number2=50;
        sum=number1+number2;
        System.out.println("Sum of numbers="+sum);
    }
    public void getProduct(){

        System.out.println("Product from Child="+(number1*number2));
    }
    public void getAverage(){
        System.out.println("average of 2 numbers="+(sum/2));
    }
}
