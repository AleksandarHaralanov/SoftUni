package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.lab.code;

import java.util.Scanner;

public class NumberOneHundredToTwoHundred {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 100) {
                System.out.println("Less than 100");
            } else if (num <= 200) {
                System.out.println("Between 100 and 200");
            } else {
                System.out.println("Greater than 200");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
