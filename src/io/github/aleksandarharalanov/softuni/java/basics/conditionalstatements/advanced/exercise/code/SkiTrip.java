package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.exercise.code;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int days = Integer.parseInt(scanner.nextLine());
            String room = scanner.nextLine();
            String score = scanner.nextLine();

            int nights = days - 1;
            double rentPerNight = 0;
            double discount = 0;

            switch (room) {
                case "room for one person":
                    rentPerNight = 18.0;
                    break;
                case "apartment":
                    rentPerNight = 25.0;
                    if (nights < 10) {
                        discount = 0.3;
                    } else if (nights <= 15) {
                        discount = 0.35;
                    } else {
                        discount = 0.5;
                    }
                    break;
                case "president apartment":
                    rentPerNight = 35.0;
                    if (nights < 10) {
                        discount = 0.1;
                    } else if (nights <= 15) {
                        discount = 0.15;
                    } else {
                        discount = 0.2;
                    }
                    break;
                default:
                    break;
            }

            double totalRent = rentPerNight * nights;
            totalRent = totalRent - (totalRent * discount);

            switch (score) {
                case "positive":
                    totalRent += totalRent * 0.25;
                    break;
                case "negative":
                    totalRent -= totalRent * 0.1;
                    break;
                default:
                    break;
            }

            System.out.printf("%.2f%n", totalRent);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
