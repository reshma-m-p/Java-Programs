package org.JavaAssignments;

import java.util.Scanner;

public class CalculateGrade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark:");
        int mark = scanner.nextInt();
        System.out.println("Grade is " + getGrade(mark));
    }

    public static char getGrade(int mark) {
        char grade;
        if (mark >= 90 && mark <= 100)
            grade = 'A';
        else if (mark >= 75 && mark <= 89)
            grade = 'B';
        else if (mark >= 50 && mark <= 74) {
            grade = 'C';
        } else
            grade = 'F';
        return grade;
    }
}
