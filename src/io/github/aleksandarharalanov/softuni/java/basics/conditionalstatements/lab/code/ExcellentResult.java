package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.lab.code;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade >= 5) {
                System.out.println("Excellent!");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
