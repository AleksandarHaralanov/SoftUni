package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num = Integer.parseInt(scanner.nextLine());

            if (!(num >= 100 && num <= 200 || num == 0)) {
                System.out.println("invalid");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
