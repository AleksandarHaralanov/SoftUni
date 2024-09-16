package io.github.aleksandarharalanov.softuni.java.basics.forloop.lab.code;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.nextLine());

            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sum1 += scanner.nextInt();
                } else {
                    sum2 += scanner.nextInt();
                }
            }

            if (sum1 == sum2) {
                System.out.println("Yes");
                System.out.printf("Sum = %d%n", sum1);
            } else {
                System.out.println("No");
                System.out.printf("Diff = %d%n", Math.abs(sum1 - sum2));
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
