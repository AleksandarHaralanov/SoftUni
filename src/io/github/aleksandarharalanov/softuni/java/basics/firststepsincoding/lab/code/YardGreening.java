package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.lab.code;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sqM = Integer.parseInt(scanner.nextLine());

            double price = sqM * 7.61;
            double discount = price * 0.18;
            double finalPrice = price - discount;

            System.out.printf("The final price is: %.2f lv.%n", finalPrice);
            System.out.printf("The discount is: %.2f lv.", discount);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input for SqM. Please enter a valid integer.");
        }
    }
}
