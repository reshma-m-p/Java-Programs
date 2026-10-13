package org.abstraction;

public class TestOddAbstractChild extends TestOddAbstractParent {
    public void getOddNumbers(){
        for (int i=50;i<=100;i++){
            if (i%2!=0)
                System.out.println(i);
        }
    }
}
