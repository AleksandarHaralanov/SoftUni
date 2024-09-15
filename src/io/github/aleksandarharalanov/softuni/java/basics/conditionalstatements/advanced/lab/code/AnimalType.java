package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String day = scanner.nextLine();

            switch (day) {
                case "crocodile":
                case "tortoise":
                case "snake":
                    System.out.println("reptile");
                    break;
                case "dog":
                    System.out.println("mammal");
                    break;
                default:
                    System.out.println("unknown");
                    break;
            }
        }
    }
}
