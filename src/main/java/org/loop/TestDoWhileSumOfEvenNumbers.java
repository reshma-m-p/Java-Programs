package org.loop;

public class TestDoWhileSumOfEvenNumbers {
    public static void main(String[] args) {
        System.out.println("sum of even numbers " + getSumOfEvenNumbers());
    }

    public static int getSumOfEvenNumbers() {
        int sum = 0, number = 1;
        do {
            if (number % 2 == 0) {
                System.out.println(number);
                sum = sum + number;

            }
            number++;
        } while (number <= 20);
        return sum;
    }
}
