package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.exercise.code;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double budget = Double.parseDouble(scanner.nextLine());
            String season = scanner.nextLine().toLowerCase();

            double spent;
            String destination;
            String accommodation;
            if (budget <= 100) {
                switch (season) {
                    case "summer":
                        destination = "Bulgaria";
                        spent = budget * 0.30;
                        accommodation = "Camp";
                        break;
                    case "winter":
                        destination = "Bulgaria";
                        spent = budget * 0.7;
                        accommodation = "Hotel";
                        break;
                    default:
                        return;
                }
            } else if (budget <= 1000) {
                switch (season) {
                    case "summer":
                        destination = "Balkans";
                        spent = budget * 0.4;
                        accommodation = "Camp";
                        break;
                    case "winter":
                        destination = "Balkans";
                        spent = budget * 0.8;
                        accommodation = "Hotel";
                        break;
                    default:
                        return;
                }
            } else {
                destination = "Europe";
                spent = budget * 0.9;
                accommodation = "Hotel";
            }

            System.out.printf("Somewhere in %s%n", destination);
            System.out.printf("%s - %.2f%n", accommodation, spent);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer or double).", e);
        }
    }
}
