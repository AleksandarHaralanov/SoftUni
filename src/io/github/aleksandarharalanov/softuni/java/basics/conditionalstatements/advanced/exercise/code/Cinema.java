package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.exercise.code;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String projection = scanner.nextLine();
            int rows = Integer.parseInt(scanner.nextLine());
            int columns = Integer.parseInt(scanner.nextLine());

            double income;
            switch (projection) {
                case "Premiere":
                    income = rows * columns * 12;
                    break;
                case "Normal":
                    income = rows * columns * 7.5;
                    break;
                case "Discount":
                    income = rows * columns * 5;
                    break;
                default:
                    return;
            }

            System.out.printf("%.2f leva%n", income);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
