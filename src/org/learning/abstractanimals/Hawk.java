package org.learning.abstractanimals;

public class Hawk extends Animal implements CanFly{
    public Hawk(String name) {
        super(name);
    }

    @Override
    public void animalNoise() {
        System.out.println("Squeal");
    }

    @Override
    public void animalFeed() {
        System.out.println("Small Mammals, Birds, Reptiles");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!!!!!");
    }
}
