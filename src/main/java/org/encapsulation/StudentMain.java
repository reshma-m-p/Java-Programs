package org.encapsulation;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Reshma");
        student.setRollNo(1);
        System.out.println("Name of student : " + student.getName() + " and Roll no : " + student.getRollNo());
    }
}
