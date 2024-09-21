package io.github.aleksandarharalanov.softuni.java.basics.nestedloops.exercise.code;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.nextLine());

            int current = 1;
            boolean isBigger = false;
            for (int rows = 1; rows <= n; rows++) {
                for (int cols = 1; cols <= rows; cols++) {
                    if (current > n) {
                        isBigger = true;
                        break;
                    }
                    System.out.printf("%d ", current);
                    current++;
                }
                if (isBigger) {
                    break;
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
