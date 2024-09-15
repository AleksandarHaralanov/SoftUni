package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int hour = Integer.parseInt(scanner.nextLine());
            String day = scanner.nextLine();

            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    if (hour >= 10 && hour <= 18) {
                        System.out.println("open");
                    } else {
                        System.out.println("closed");
                    }
                    break;
                case "Sunday":
                    System.out.println("closed");
                    break;
                default:
                    break;
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
