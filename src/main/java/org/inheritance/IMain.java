package org.inheritance;

public class IMain {
    public static void main(String[] args) {
        IDog dog=new IDog();
        dog.eat();
        dog.display();
        dog.name="Rooh";
        dog.display();
        IAnimal a=new IDog();
        a.display();
        IAnimal aa=new IAnimal();
        aa.display();
    }
}
