package io.github.aleksandarharalanov.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            int min = Integer.MAX_VALUE;
            while (!input.equals("Stop")) {
                int num = Integer.parseInt(input);
                if (num < min) {
                    min = num;
                }

                input = scanner.nextLine();
            }

            System.out.println(min);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
