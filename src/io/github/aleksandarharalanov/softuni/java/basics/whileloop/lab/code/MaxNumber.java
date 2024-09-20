package io.github.aleksandarharalanov.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            while (!input.equals("Stop")) {
                int num = Integer.parseInt(input);
                if (num > max) {
                    max = num;
                }

                input = scanner.nextLine();
            }

            System.out.println(max);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
