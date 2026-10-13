package org.encapsulation;

public class Student {
    private int rollNo;
    private String name;

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int No) {
        this.rollNo = No;
    }

    public void setName(String sname) {
        name = sname;
    }
}
