package io.github.aleksandarharalanov.softuni.java.basics.exam.code;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalSales = 0;
        double totalAverage = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int rating = Integer.parseInt(input.substring(2));
            int sales = Integer.parseInt(input.substring(0, 2));

            double cut = 0;

            switch (rating) {
                case 2 -> cut = 0;
                case 3 -> cut = 0.5;
                case 4 -> cut = 0.7;
                case 5 -> cut = 0.85;
                case 6 -> cut = 1;
            }

            totalAverage += rating;
            totalSales += sales * cut;
        }

        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f%n", totalAverage / n);
    }
}
