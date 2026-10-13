package org.interfaces;

public class TestAnimalMain {
    public static void main(String[] args) {
        TestAnimal animal = new TestAnimal();
        animal.meow();
        animal.play();
        TestCat cat = new TestAnimal();
        cat.meow();
        cat.play();
        Birds bird = new TestAnimal();
        bird.eat();
        bird.fly();
    }
}

