package org.learning.abstractanimals;

public class Dog extends Animal implements CanSwim {
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

    @Override
    public void swim() {
        System.out.println("I'm swimming!!!!!");
    }
}
