package io.github.aleksandarharalanov.softuni.java.basics.forloop.exercise.code;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int groups = Integer.parseInt(scanner.nextLine());

            int musala = 0;
            int monblan = 0;
            int kilimandjaro = 0;
            int k2 = 0;
            int everest = 0;
            for (int i = 0; i < groups; i++) {
                int people = Integer.parseInt(scanner.nextLine());

                if (people >= 0 && people <= 5) {
                    musala += people;
                } else if (people <= 12) {
                    monblan += people;
                } else if (people <= 25) {
                    kilimandjaro += people;
                } else if (people <= 40) {
                    k2 += people;
                } else {
                    everest += people;
                }
            }

            int totalPeople = musala + monblan + kilimandjaro + k2 + everest;
            double climbingMusala = ((double) musala / totalPeople) * 100;
            double climbingMonblan = ((double) monblan / totalPeople) * 100;
            double climbingKilimandjaro = ((double) kilimandjaro / totalPeople) * 100;
            double climbingK2 = ((double) k2 / totalPeople) * 100;
            double climbingEverest = ((double) everest / totalPeople) * 100;

            System.out.printf("%.2f%%%n", climbingMusala);
            System.out.printf("%.2f%%%n", climbingMonblan);
            System.out.printf("%.2f%%%n", climbingKilimandjaro);
            System.out.printf("%.2f%%%n", climbingK2);
            System.out.printf("%.2f%%%n", climbingEverest);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
