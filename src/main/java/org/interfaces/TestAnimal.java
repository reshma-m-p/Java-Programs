package org.interfaces;

public class TestAnimal implements TestCat,Birds{
    @Override
    public void meow() {
        System.out.println("Cats Sounds meow meow......");
    }

    @Override
    public void play() {
        System.out.println("Cat plays.........");
    }

    @Override
    public void fly() {
        System.out.println("Birds Fly......");
    }
    public void eat(){
        System.out.println("Birds eats....");
    }
}
