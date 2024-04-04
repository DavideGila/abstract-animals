package org.learning.abstractanimals;

public class Dolphin extends Animal {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void animalNoise() {
        System.out.println("Whistle");
    }

    @Override
    public void animalFeed() {
        System.out.println("Fish, Cephalopods, Crustaceans");
    }
}
