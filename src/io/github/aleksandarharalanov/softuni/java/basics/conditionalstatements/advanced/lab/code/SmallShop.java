package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (city) {
            case "Sofia" -> {
                switch (product) {
                    case "coffee" -> price = 0.5;
                    case "water" -> price = 0.8;
                    case "beer" -> price = 1.2;
                    case "sweets" -> price = 1.45;
                    case "peanuts" -> price = 1.6;
                }
            }
            case "Plovdiv" -> {
                switch (product) {
                    case "coffee" -> price = 0.4;
                    case "water" -> price = 0.7;
                    case "beer" -> price = 1.15;
                    case "sweets" -> price = 1.3;
                    case "peanuts" -> price = 1.5;
                }
            }
            case "Varna" -> {
                switch (product) {
                    case "coffee" -> price = 0.45;
                    case "water" -> price = 0.7;
                    case "beer" -> price = 1.1;
                    case "sweets" -> price = 1.35;
                    case "peanuts" -> price = 1.55;
                }
            }
        }

        double cost = quantity * price;
        System.out.println(cost);
    }
}
