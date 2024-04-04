package org.learning.abstractanimals;

public class Sparrow extends Animal implements CanFly{
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void animalNoise() {
        System.out.println("Cheep cheep");
    }

    @Override
    public void animalFeed() {
        System.out.println("Seeds, Insects, Fruits");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!!!!!");
    }
}
