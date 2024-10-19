package io.github.aleksandarharalanov.softuni.java.basics.exam.preparations.prep8.code;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = scanner.nextInt();

        double total = 0;

        for (int i = 1; i <= days; i++) {
            double daily = 0;

            for (int j = 1; j <= hoursPerDay; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    daily += 2.5;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    daily += 1.25;
                } else {
                    daily += 1;
                }
            }

            System.out.printf("Day: %d - %.2f leva%n", i, daily);
            total += daily;
        }

        System.out.printf("Total: %.2f leva%n", total);
    }
}
