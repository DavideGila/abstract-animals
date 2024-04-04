package org.learning.abstractanimals;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {new Dog("Barney"), new Sparrow("Feather"), new Hawk("Talon"),
        new Dolphin("Flipper")};

        for (Animals animal : animals){
            if (animal instanceof Dog) {
                System.out.println("Dog: " + animal.getName());
                System.out.print("Animal noise: ");
                animal.animalNoise();
                System.out.print("Animal feed: ");
                animal.animalFeed();
            } else if (animal instanceof Sparrow) {
                System.out.println("Sparrow: " + animal.getName());
                System.out.print("Animal noise: ");
                animal.animalNoise();
                System.out.print("Animal feed: ");
                animal.animalFeed();
            } else if (animal instanceof Hawk) {
                System.out.println("Hawk: " + animal.getName());
                System.out.print("Animal noise: ");
                animal.animalNoise();
                System.out.print("Animal feed: ");
                animal.animalFeed();
            } else if (animal instanceof Dolphin) {
                System.out.println("Dolphin: " + animal.getName());
                System.out.print("Animal noise: ");
                animal.animalNoise();
                System.out.print("Animal feed: ");
                animal.animalFeed();
            }

            animal.sleep();
            System.out.println();
        }
    }
}
