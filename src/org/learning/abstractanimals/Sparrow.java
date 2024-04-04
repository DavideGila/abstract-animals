package org.learning.abstractanimals;

public class Sparrow extends Animals {
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
}
