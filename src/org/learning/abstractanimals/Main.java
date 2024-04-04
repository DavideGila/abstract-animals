package org.learning.abstractanimals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Barney"), new Sparrow("Feather"), new Hawk("Talon"),
                new Dolphin("Flipper")};

        for (Animal animal : animals) {
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

            if (animal instanceof CanFly) {
                faiVolare((CanFly) animal);
            } else if (animal instanceof CanSwim) {
                faiNuotare((CanSwim) animal);
            }

            animal.sleep();
            System.out.println();
        }
    }

    public static void faiVolare(CanFly animal) {
        animal.fly();
    }
    public static void faiNuotare(CanSwim animal) {
        animal.swim();
    }
}
