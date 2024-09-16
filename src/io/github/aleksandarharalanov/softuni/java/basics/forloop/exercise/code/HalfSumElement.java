package io.github.aleksandarharalanov.softuni.java.basics.forloop.exercise.code;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.nextLine());

            int max = Integer.MIN_VALUE;
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                int num = Integer.parseInt(scanner.nextLine());
                sum += num;

                if (num > max) {
                    max = num;
                }
            }

            int sumMinusMax = sum - max;
            if (max == sumMinusMax) {
                System.out.println("Yes");
                System.out.printf("Sum = %d%n", max);
            } else {
                System.out.println("No");
                System.out.printf("Diff = %d%n", Math.abs(max - sumMinusMax));
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
