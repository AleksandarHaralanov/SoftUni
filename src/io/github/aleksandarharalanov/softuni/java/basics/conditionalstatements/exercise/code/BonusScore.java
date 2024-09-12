package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.exercise.code;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = Integer.parseInt(scanner.nextLine());

            double bonus;

            if (number <= 100) {
                bonus = 5;
            } else if (number < 1000) {
                bonus = number * 0.2;
            } else {
                bonus = number * 0.1;
            }

            if (number % 2 == 0) {
                bonus += 1;
            } else if (number % 10 == 5) {
                bonus += 2;
            }

            System.out.println(bonus);
            System.out.println(number + bonus);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
