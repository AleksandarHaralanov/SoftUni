package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price;

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                switch (fruit) {
                    case "banana" -> price = 2.5;
                    case "apple" -> price = 1.2;
                    case "orange" -> price = 0.85;
                    case "grapefruit" -> price = 1.45;
                    case "kiwi" -> price = 2.7;
                    case "pineapple" -> price = 5.5;
                    case "grapes" -> price = 3.85;
                    default -> {
                        System.out.println("error");
                        return;
                    }
                }
            }
            case "Saturday", "Sunday" -> {
                switch (fruit) {
                    case "banana" -> price = 2.7;
                    case "apple" -> price = 1.25;
                    case "orange" -> price = 0.9;
                    case "grapefruit" -> price = 1.6;
                    case "kiwi" -> price = 3.0;
                    case "pineapple" -> price = 5.6;
                    case "grapes" -> price = 4.2;
                    default -> {
                        System.out.println("error");
                        return;
                    }
                }
            }
            default -> {
                System.out.println("error");
                return;
            }
        }

        double cost = quantity * price;

        System.out.printf("%.2f%n", cost);
    }
}
