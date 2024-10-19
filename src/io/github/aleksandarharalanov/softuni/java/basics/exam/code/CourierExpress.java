package io.github.aleksandarharalanov.softuni.java.basics.exam.code;

import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double packageKg = Double.parseDouble(scanner.nextLine());
        String typeService = scanner.nextLine();
        int distanceKm = scanner.nextInt();

        double perKmTax = 0;
        double markup = 0;

        if (packageKg < 1) {
            perKmTax = 3;
        } else if (packageKg >= 1 && packageKg < 10) {
            perKmTax = 5;
        } else if (packageKg >= 10 && packageKg < 40) {
            perKmTax = 10;
        } else if (packageKg >= 40 && packageKg < 90) {
            perKmTax = 15;
        } else if (packageKg >= 90 && packageKg < 150) {
            perKmTax = 20;
        }

        if (packageKg < 1) {
            markup = 0.8;
        } else if (packageKg >= 1 && packageKg < 10) {
            markup = 0.4;
        } else if (packageKg >= 10 && packageKg < 40) {
            markup = 0.05;
        } else if (packageKg >= 40 && packageKg < 90) {
            markup = 0.02;
        } else if (packageKg >= 90 && packageKg < 150) {
            markup = 0.01;
        }

        double finalSum = 0;

        switch (typeService) {
            case "standard" -> finalSum = distanceKm * perKmTax;
            case "express" -> {
                double markupForKg = markup * perKmTax;
                double markupForKm = perKmTax * markupForKg;
                double totalMarkup = distanceKm * markupForKm;
                finalSum = distanceKm * perKmTax + totalMarkup;
            }
        }

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.%n", packageKg, finalSum);
    }
}
