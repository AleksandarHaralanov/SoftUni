package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.lab.code;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sqM = Integer.parseInt(scanner.nextLine());

            double cost = sqM * 7.61;
            double discount = cost * 0.18;
            double finalPrice = cost - discount;

            System.out.printf("The final price is: %.2f lv.%n", finalPrice);
            System.out.printf("The discount is: %.2f lv.%n", discount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
