package org.Practice;

public class InstanceStaticVariablesTest {
    public static void main(String[] args) {
        InstanceStaticVariables obj=new InstanceStaticVariables();
        InstanceStaticVariables obj1=new InstanceStaticVariables();
        System.out.println(InstanceStaticVariables.no);
        System.out.println(obj.iNo);
        System.out.println(obj1.no);
    }
}
