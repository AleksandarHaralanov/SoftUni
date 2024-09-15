package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String city = scanner.nextLine();
            double sales = Double.parseDouble(scanner.nextLine());

            if (sales < 0) {
                System.out.println("error");
                return;
            }

            double commission = 0;

            switch (city) {
                case "Sofia":
                    if (sales <= 500) {
                        commission = 0.05;
                    } else if (sales <= 1000) {
                        commission = 0.07;
                    } else if (sales <= 10000) {
                        commission = 0.08;
                    } else {
                        commission = 0.12;
                    }
                    break;
                case "Plovdiv":
                    if (sales <= 500) {
                        commission = 0.055;
                    } else if (sales <= 1000) {
                        commission = 0.08;
                    } else if (sales <= 10000) {
                        commission = 0.12;
                    } else {
                        commission = 0.145;
                    }
                    break;
                case "Varna":
                    if (sales <= 500) {
                        commission = 0.045;
                    } else if (sales <= 1000) {
                        commission = 0.075;
                    } else if (sales <= 10000) {
                        commission = 0.10;
                    } else {
                        commission = 0.13;
                    }
                    break;
                default:
                    System.out.println("error");
                    return;
            }

            System.out.printf("%.2f%n", sales * commission);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer or double).", e);
        }
    }
}
