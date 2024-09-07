package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int pageCount = Integer.parseInt(scanner.nextLine());
            int pagesPerHour = Integer.parseInt(scanner.nextLine());
            int daysNeeded = Integer.parseInt(scanner.nextLine());
            int hoursNeeded = pageCount / pagesPerHour;
            int hoursPerDay = hoursNeeded / daysNeeded;
            System.out.println(hoursPerDay);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number (integer).");
        }
    }
}
