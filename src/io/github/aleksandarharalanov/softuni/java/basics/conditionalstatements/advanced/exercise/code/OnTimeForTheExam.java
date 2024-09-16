package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.exercise.code;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int examHour = Integer.parseInt(scanner.nextLine());
            int examMinute = Integer.parseInt(scanner.nextLine());
            int arrivalHour = Integer.parseInt(scanner.nextLine());
            int arrivalMinutes = Integer.parseInt(scanner.nextLine());

            int examTimeInMinutes = examHour * 60 + examMinute;
            int arrivalTimeInMinutes = arrivalHour * 60 + arrivalMinutes;
            int difference = arrivalTimeInMinutes - examTimeInMinutes;

            if (difference > 0) {
                System.out.println("Late");
                if (difference < 60) {
                    System.out.printf("%d minutes after the start%n", difference);
                } else {
                    int hours = difference / 60;
                    int minutes = difference % 60;
                    System.out.printf("%d:%02d hours after the start%n", hours,  minutes);
                }
            } else if (difference >= -30) {
                System.out.println("On time");
                if (difference < 0){
                    System.out.printf("%d minutes before the start%n", Math.abs(difference));
                }
            } else {
                System.out.println("Early");
                difference = Math.abs(difference);
                if (difference < 60) {
                    System.out.printf("%d minutes before the start%n", difference);
                } else {
                    int hours = difference / 60;
                    int minutes = difference % 60;
                    System.out.printf("%d:%02d hours before the start%n", hours, minutes);
                }
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
