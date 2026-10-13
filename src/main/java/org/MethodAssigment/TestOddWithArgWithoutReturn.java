package org.MethodAssigment;

public class TestOddWithArgWithoutReturn {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 50 and 100.");
        TestOddWithArgWithoutReturn obj=new TestOddWithArgWithoutReturn();
        obj.getOddNumbers(50,100);
    }
    public void getOddNumbers(int start,int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}
