package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.exercise.code;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double recordSeconds = Double.parseDouble(scanner.nextLine());
            double distanceMeters = Double.parseDouble(scanner.nextLine());
            double meterPerSecond = Double.parseDouble(scanner.nextLine());

            double timeTaken = distanceMeters * meterPerSecond;
            double timeAddition = Math.floor(distanceMeters / 15) * 12.5;
            double personalBest = timeTaken + timeAddition;

            if (personalBest < recordSeconds) {
                System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", personalBest);
            } else {
                System.out.printf("No, he failed! He was %.2f seconds slower.", personalBest - recordSeconds);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer or double).", e);
        }
    }
}
