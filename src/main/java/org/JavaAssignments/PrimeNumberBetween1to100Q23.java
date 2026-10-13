package org.JavaAssignments;

public class PrimeNumberBetween1to100Q23 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Prime numbers between 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count <= 2)
                System.out.print(i+" ");
        }
    }
}
