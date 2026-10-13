package org.MethodAssigment;

public class TestOddWithoutArgWithReturn {
    public static void main(String[] args) {
        System.out.println("-Odd numbers between 50 and 100-");
        int[] result = getOddNumbers();
        for (int i = 0; i <= result.length - 1; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] getOddNumbers() {
        int count = 0;
        int[] result = new int[25];
        for (int i = 50; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                result[count] = i;
                count++;
            }
        }
        return result;
    }
}
