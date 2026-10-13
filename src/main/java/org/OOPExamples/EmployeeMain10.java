package org.OOPExamples;

public class EmployeeMain10 {
    public static void main(String[] args) {
        Employee10 employee=new Employee10();
        employee.work();
        employee.getSalary();
        HrManager10 manager=new HrManager10();
        manager.work();
        manager.getSalary();
        manager.addEmployee();
    }
}
