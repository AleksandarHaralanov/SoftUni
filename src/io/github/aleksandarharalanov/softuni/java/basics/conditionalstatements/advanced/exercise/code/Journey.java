package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.exercise.code;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double budget = Double.parseDouble(scanner.nextLine());
            String season = scanner.nextLine().toLowerCase();
            String destination = "";
            String accommodation = "";
            double spent = 0;

            if (budget <= 100) {
                switch (season) {
                    case "summer" -> {
                        destination = "Bulgaria";
                        accommodation = "Camp";
                        spent = budget * 0.30;
                    }
                    case "winter" -> {
                        destination = "Bulgaria";
                        accommodation = "Hotel";
                        spent = budget * 0.7;
                    }
                }
            } else if (budget <= 1000) {
                switch (season) {
                    case "summer" -> {
                        destination = "Balkans";
                        accommodation = "Camp";
                        spent = budget * 0.4;
                    }
                    case "winter" -> {
                        destination = "Balkans";
                        accommodation = "Hotel";
                        spent = budget * 0.8;
                    }
                }
            } else {
                destination = "Europe";
                accommodation = "Hotel";
                spent = budget * 0.9;
            }

            System.out.printf("Somewhere in %s%n", destination);
            System.out.printf("%s - %.2f%n", accommodation, spent);
    }
}
