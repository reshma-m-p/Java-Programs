package org.OOPExamples;

public class PersonMain1 {
    public static void main(String[] args) {
        Person1 personOne = new Person1(10, "Manu");
        System.out.println("Name of first person is " + personOne.name + " and age is " + personOne.age);
        Person1 personTwo = new Person1(15, "Riya");
        System.out.println("Name of second person is " + personTwo.name + " and age is " + personTwo.age);
    }
}
