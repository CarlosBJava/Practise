package com.track.trackandfield;

import java.util.List;

// Java 3?
public class Inheritance  {

    public void doIt() {
        Animal sandersDog = new Dog();
        Animal sandersCat = new Cat();
        Animal sandersFish = new Fish();

        var animals = List.of(sandersDog, sandersCat, sandersFish);

        animals.forEach(animal -> animal.makeNoise());
    }
}

abstract class Animal {
    abstract void makeNoise();
}

class Dog extends Animal {

    @Override
    void makeNoise() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {

    @Override
    void makeNoise() {
        System.out.println("Meow");
    }
}

class Fish extends Animal {

    @Override
    void makeNoise() {
        System.out.println("Blup");
    }
}
