package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.exercise.code;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double budget = Double.parseDouble(scanner.nextLine());
            int actors = Integer.parseInt(scanner.nextLine());
            double clothes = Double.parseDouble(scanner.nextLine());

            double decor = budget * 0.1;
            double clothesTotal = actors * clothes;
            if (actors > 150) {
                clothesTotal -= clothesTotal * 0.1;
            }
            double total = decor + clothesTotal;

            if (total > budget) {
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.%n", total - budget);
            } else {
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.%n", budget - total);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer or double).", e);
        }
    }
}
