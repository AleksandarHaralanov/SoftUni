package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.lab.code;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            double finalPrice = (dogFood * 2.5) + (catFood * 4);
            System.out.printf("%.2f lv.", finalPrice);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Invalid input for food. Please enter a valid number (integer).");
        }
    }
}
