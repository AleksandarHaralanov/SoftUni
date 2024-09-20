package io.github.aleksandarharalanov.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        double total = 0.0;
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            while (!input.equals("NoMoreMoney")) {
                double increase = Double.parseDouble(input);
                if (increase < 0) {
                    System.out.println("Invalid operation!");
                    break;
                }

                System.out.printf("Increase: %.2f%n", increase);
                total += increase;
                input = scanner.nextLine();
            }

            System.out.printf("Total: %.2f%n", total);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer or double).", e);
        }
    }
}
