package io.github.aleksandarharalanov.softuni.java.basics.nestedloops.exercise.code;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;

        while (true) {
            String movieName = scanner.nextLine();
            if (movieName.equals("Finish")) {
                break;
            }

            int freeSeats = Integer.parseInt(scanner.nextLine());
            int takenSeats = 0;
            while (true) {
                if (takenSeats >= freeSeats) {
                    break;
                }

                String type = scanner.nextLine();
                if (type.equals("End")) {
                    break;
                }

                switch (type) {
                    case "student" -> studentTickets++;
                    case "standard" -> standardTickets++;
                    case "kid" -> kidsTickets++;
                }
                totalTickets++;
                takenSeats++;
            }

            double percentFull = (takenSeats * 100.0) / freeSeats;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentFull);
        }

        double percentageStudent = (studentTickets * 100.0) / totalTickets;
        double percentageStandard = (standardTickets * 100.0) / totalTickets;
        double percentageKids = (kidsTickets * 100.0) / totalTickets;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentageStudent);
        System.out.printf("%.2f%% standard tickets.%n", percentageStandard);
        System.out.printf("%.2f%% kids tickets.%n", percentageKids);
    }
}
