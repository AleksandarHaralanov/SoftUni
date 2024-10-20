package io.github.aleksandarharalanov.softuni.java.basics.exam.code;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = scanner.nextLine();
        double cut = 1;

        switch (season) {
            case "summer" -> cut = location.equals("Bulgaria") ? 0.95 : 0.90;
            case "winter" -> cut = location.equals("Bulgaria") ? 0.92 : 0.85;
        }

        double bonus = location.equals("Abroad") ? 1.5 : 1;
        double wonCompetition = ((dancers * points) * bonus) * cut;

        double charity = wonCompetition * 0.75;
        double moneyPerDancer = (wonCompetition - charity) / dancers;

        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f%n", moneyPerDancer);
    }
}
