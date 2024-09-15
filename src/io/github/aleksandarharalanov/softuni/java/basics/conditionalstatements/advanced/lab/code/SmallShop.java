package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String product = scanner.nextLine();
            String city = scanner.nextLine();
            double quantity = Double.parseDouble(scanner.nextLine());

            double price;
            switch (city) {
                case "Sofia":
                    switch (product) {
                        case "coffee":
                            price = 0.5;
                            break;
                        case "water":
                            price = 0.8;
                            break;
                        case "beer":
                            price = 1.2;
                            break;
                        case "sweets":
                            price = 1.45;
                            break;
                        case "peanuts":
                            price = 1.6;
                            break;
                        default:
                            return;
                    }
                    break;
                case "Plovdiv":
                    switch (product) {
                        case "coffee":
                            price = 0.4;
                            break;
                        case "water":
                            price = 0.7;
                            break;
                        case "beer":
                            price = 1.15;
                            break;
                        case "sweets":
                            price = 1.30;
                            break;
                        case "peanuts":
                            price = 1.5;
                            break;
                        default:
                            return;
                    }
                    break;
                case "Varna":
                    switch (product) {
                        case "coffee":
                            price = 0.45;
                            break;
                        case "water":
                            price = 0.7;
                            break;
                        case "beer":
                            price = 1.10;
                            break;
                        case "sweets":
                            price = 1.35;
                            break;
                        case "peanuts":
                            price = 1.55;
                            break;
                        default:
                            return;
                    }
                    break;
                default:
                    return;
            }

            System.out.println(quantity * price);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer or double).", e);
        }
    }
}
