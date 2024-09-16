package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.exercise.code;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String season = scanner.nextLine();
            int nights = Integer.parseInt(scanner.nextLine());

            double studio = 0;
            double apartment = 0;

            switch (season) {
                case "May":
                case "October":
                    if (nights > 14) {
                        studio = nights * 50 * 0.7;
                        apartment = nights * 65 * 0.9;
                    } else if (nights > 7 ) {
                        studio = nights * 50 * 0.95;
                        apartment = nights * 65;
                    } else {
                        studio = nights * 50;
                        apartment = nights * 65;
                    }
                    break;
                case "June":
                case "September":
                    if (nights > 14) {
                        studio = nights * 75.2 * 0.8;
                        apartment = nights * 68.7 * 0.9;
                    } else {
                        studio = nights * 75.2;
                        apartment = nights * 68.7;
                    }
                    break;
                case "July":
                case "August":
                    if (nights > 14 ){
                        studio = nights * 76;
                        apartment = nights * 77 * 0.9;
                    } else {
                        studio = nights * 76;
                        apartment = nights * 77;
                    }
                    break;
                default:
                    break;
            }

            System.out.printf("Apartment: %.2f lv.%n", apartment);
            System.out.printf("Studio: %.2f lv.%n", studio);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
