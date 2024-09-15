package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String fruit = scanner.nextLine();
            String day = scanner.nextLine();
            double quantity = Double.parseDouble(scanner.nextLine());

            double price;
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    switch (fruit) {
                        case "banana":
                            price = 2.5;
                            break;
                        case "apple":
                            price = 1.2;
                            break;
                        case "orange":
                            price = 0.85;
                            break;
                        case "grapefruit":
                            price = 1.45;
                            break;
                        case "kiwi":
                            price = 2.7;
                            break;
                        case "pineapple":
                            price = 5.5;
                            break;
                        case "grapes":
                            price = 3.85;
                            break;
                        default:
                            System.out.println("error");
                            return;
                    }
                    break;
                case "Saturday":
                case "Sunday":
                    switch (fruit) {
                        case "banana":
                            price = 2.7;
                            break;
                        case "apple":
                            price = 1.25;
                            break;
                        case "orange":
                            price = 0.9;
                            break;
                        case "grapefruit":
                            price = 1.6;
                            break;
                        case "kiwi":
                            price = 3.0;
                            break;
                        case "pineapple":
                            price = 5.6;
                            break;
                        case "grapes":
                            price = 4.2;
                            break;
                        default:
                            System.out.println("error");
                            return;
                    }
                    break;
                default:
                    System.out.println("error");
                    return;
            }

            System.out.printf("%.2f%n", quantity * price);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer or double).", e);
        }
    }
}
