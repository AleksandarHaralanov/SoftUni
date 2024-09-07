package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double inches = Double.parseDouble(scanner.nextLine());
            System.out.println(inches * 2.54);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number (integer or decimal).");
        }
    }
}
