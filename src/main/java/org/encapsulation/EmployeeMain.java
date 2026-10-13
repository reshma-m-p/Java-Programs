package org.encapsulation;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSsn(111);
        employee.setEmpName("Anu");
        employee.setEmpAge(25);
        System.out.println("Employee ssn : " + employee.getSsn());
        System.out.println("Employee Name : " + employee.getEmpName());
        System.out.println("Employee Age : " + employee.getEmpAge());
    }
}
