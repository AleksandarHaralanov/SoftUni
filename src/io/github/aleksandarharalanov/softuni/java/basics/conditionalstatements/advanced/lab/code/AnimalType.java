package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        switch (animal) {
            case "crocodile", "tortoise", "snake" -> System.out.println("reptile");
            case "dog" -> System.out.println("mammal");
            default -> System.out.println("unknown");
        }
    }
}
