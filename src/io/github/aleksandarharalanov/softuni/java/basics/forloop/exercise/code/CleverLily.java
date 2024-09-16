package io.github.aleksandarharalanov.softuni.java.basics.forloop.exercise.code;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int age = Integer.parseInt(scanner.nextLine());
            double priceWashingMachine = Double.parseDouble(scanner.nextLine());
            int priceToy = Integer.parseInt(scanner.nextLine());

            int toyCount = 0;
            double totalMoney = 0;
            double moneyGift = 10;

            for (int i = 1; i <= age; i++) {
                if (i % 2 == 0) {
                    totalMoney += moneyGift;
                    totalMoney--;
                    moneyGift += 10;
                } else {
                    toyCount++;
                }
            }

            totalMoney += toyCount * priceToy;
            if (totalMoney >= priceWashingMachine) {
                System.out.printf("Yes! %.2f%n", totalMoney - priceWashingMachine);
            } else {
                System.out.printf("No! %.2f%n", priceWashingMachine - totalMoney);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer or double).", e);
        }
    }
}
