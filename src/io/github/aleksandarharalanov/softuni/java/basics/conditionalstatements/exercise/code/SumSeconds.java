package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.exercise.code;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int timeFirst = Integer.parseInt(scanner.nextLine());
            int timeSecond = Integer.parseInt(scanner.nextLine());
            int timeThird = Integer.parseInt(scanner.nextLine());

            int totalTime = timeFirst + timeSecond + timeThird;
            int minutes = totalTime / 60;
            int seconds = totalTime % 60;

            if (seconds < 10) {
                System.out.printf("%d:0%d", minutes, seconds);
            } else {
                System.out.printf("%d:%d", minutes, seconds);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input. Please enter a valid integer.");
        }
    }
}
