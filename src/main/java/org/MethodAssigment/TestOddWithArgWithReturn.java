package org.MethodAssigment;

public class TestOddWithArgWithReturn {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 50 and 100...");
        TestOddWithArgWithReturn obj = new TestOddWithArgWithReturn();
        int[] result = new int[25];
        result = obj.getOddNumbers(50, 100);
        for (int i = 0; i <= result.length - 1; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] getOddNumbers(int start, int end) {
        int count = 0;
        int[] result = new int[25];
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                result[count] = i;
                count++;
            }
        }
        return result;
    }
}
