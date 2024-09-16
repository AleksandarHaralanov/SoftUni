package io.github.aleksandarharalanov.softuni.java.basics.forloop.lab.code;

import java.util.Scanner;

public class NumbersOneToNWithStepThree {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
