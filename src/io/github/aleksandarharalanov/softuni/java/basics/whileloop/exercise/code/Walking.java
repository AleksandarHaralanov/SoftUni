package io.github.aleksandarharalanov.softuni.java.basics.whileloop.exercise.code;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int totalSteps = 0;
            while (totalSteps < 10000) {
                String input = scanner.nextLine();

                if (input.equals("Going home")) {
                    totalSteps += Integer.parseInt(scanner.nextLine());
                    break;
                } else {
                    totalSteps += Integer.parseInt(input);
                }
            }

            if (totalSteps > 10000) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!%n", totalSteps - 10000);
            } else {
                System.out.printf("%d more steps to reach goal.%n", 10000 - totalSteps);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
