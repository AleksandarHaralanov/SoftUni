package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.exercise.code;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String flower = scanner.nextLine();
            int count = Integer.parseInt(scanner.nextLine());
            int budget = Integer.parseInt(scanner.nextLine());

            double total;
            switch (flower) {
                case "Roses":
                    total = count * 5;
                    if (count > 80) {
                        total -= total * 0.1;
                    }
                    break;
                case "Dahlias":
                    total = count * 3.8;
                    if (count > 90) {
                        total -= total * 0.15;
                    }
                    break;
                case "Tulips":
                    total = count * 2.8;
                    if (count > 80) {
                        total -= total * 0.15;
                    }
                    break;
                case "Narcissus":
                    total = count * 3;
                    if (count < 120) {
                        total += total * 0.15;
                    }
                    break;
                case "Gladiolus":
                    total = count * 2.5;
                    if (count < 80) {
                        total += total * 0.2;
                    }
                    break;
                default:
                    return;
            }

            if (budget >= total) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.%n", count, flower, budget - total);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.%n", total - budget);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
