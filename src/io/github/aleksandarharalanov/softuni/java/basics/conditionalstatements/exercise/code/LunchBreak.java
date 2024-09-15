package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.exercise.code;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String serialName = scanner.nextLine();
            int episodeLength = Integer.parseInt(scanner.nextLine());
            int breakLength = Integer.parseInt(scanner.nextLine());

            double lunchLength = breakLength * 0.125;
            double restLength = breakLength * 0.25;
            double freeTime = breakLength - lunchLength - restLength;

            if (freeTime >= episodeLength) {
                System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.%n", serialName, Math.ceil(freeTime - episodeLength));
            } else {
                System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName, Math.ceil(episodeLength - freeTime));
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
