package io.github.aleksandarharalanov.softuni.java.basics.nestedloops.lab.code;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saved = 0;
            while (true) {
                String destination = scanner.nextLine();
                if (destination.equals("End")) {
                    break;
                }

                double budget = Double.parseDouble(scanner.nextLine());
                while (saved < budget) {
                    saved += Double.parseDouble(scanner.nextLine());
                }

                System.out.printf("Going to %s!%n", destination);
                saved = 0;
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
