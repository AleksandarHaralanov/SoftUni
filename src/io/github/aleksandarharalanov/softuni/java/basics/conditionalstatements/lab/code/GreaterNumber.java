package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.lab.code;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (num1 > num2) {
                System.out.println(num1);
            } else {
                System.out.println(num2);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
