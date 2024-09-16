package io.github.aleksandarharalanov.softuni.java.basics.forloop.lab.code;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.nextLine());

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();

                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            System.out.printf("Max number: %d%n", max);
            System.out.printf("Min number: %d%n", min);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
