package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int chicken = Integer.parseInt(scanner.nextLine());
            int fish = Integer.parseInt(scanner.nextLine());
            int vegetarian = Integer.parseInt(scanner.nextLine());

            double cPrice = chicken * 10.35;
            double fPrice = fish * 12.4;
            double vPrice = vegetarian * 8.15;
            double menus = cPrice + fPrice + vPrice;
            double desserts = menus * 0.2;
            double total = menus + desserts + 2.5;

            System.out.println(total);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
