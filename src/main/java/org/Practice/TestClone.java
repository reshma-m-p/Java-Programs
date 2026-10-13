package org.Practice;

public class TestClone implements Cloneable{
    public int number;
    public TestClone(int no){
        number=no;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
