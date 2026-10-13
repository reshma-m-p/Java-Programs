package org.MethodAssigment;

public class TestOddWithoutArgWithoutReturn {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 50 and 100");
        getOddNumbers();
    }

    public static void getOddNumbers() {
        for (int i = 50; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}
