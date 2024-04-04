package org.learning.abstractanimals;

public abstract class Animals {
    // ATTRIBUTI
    private String name;

    // COSTRUTTORI
    public Animals(String name) {
        this.name = name;
    }

    // GETTER E SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // METODI
    public void sleep() {
        System.out.println("ZZZzzzz");
    }
    public abstract void animalNoise();
    public abstract void animalFeed();
}
