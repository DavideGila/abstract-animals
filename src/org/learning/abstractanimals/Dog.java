package org.learning.abstractanimals;

public class Dog extends Animals{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void animalNoise() {
        System.out.println("Woof");
    }

    @Override
    public void animalFeed() {
        System.out.println("Meat, Vegetables");
    }
}