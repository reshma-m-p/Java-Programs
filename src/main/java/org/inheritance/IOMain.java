package org.inheritance;

public class IOMain {
    public static void main(String []args){
        IOAnimal animal=new IOAnimal();
        animal.eat();
        IODog dog=new IODog();
        dog.eat();
        IOAnimal ad=new IODog();
        ad.eat();
    }
}
