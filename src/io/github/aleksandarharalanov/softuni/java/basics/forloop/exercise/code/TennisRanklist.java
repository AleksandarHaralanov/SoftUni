package io.github.aleksandarharalanov.softuni.java.basics.forloop.exercise.code;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int wonPoints = 0;
        int wonTournaments = 0;

        for (int i = 0; i < tournaments; i++) {
            switch (scanner.nextLine()) {
                case "SF" -> wonPoints += 720;
                case "F" -> wonPoints += 1200;
                case "W" -> {
                    wonPoints += 2000;
                    wonTournaments++;
                }
            }
        }

        int finalPoints = startingPoints + wonPoints;
        double averagePoints = Math.floor((double) wonPoints / tournaments);
        double percentageWonTournaments = ((double) wonTournaments / tournaments) * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%%n", percentageWonTournaments);
    }
}
