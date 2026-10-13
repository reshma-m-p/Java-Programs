package org.encapsulation;

public class Employee {
    private int ssn;
    private String empName;
    private int empAge;

    public void setSsn(int essn) {
        ssn = essn;
    }

    public void setEmpName(String eempName) {
        empName = eempName;
    }

    public void setEmpAge(int eempAge) {
        empAge = eempAge;
    }

    public String getEmpName() {
        return empName;
    }

    public int getSsn() {
        return ssn;
    }

    public int getEmpAge() {
        return empAge;
    }
}
