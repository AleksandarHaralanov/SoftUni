package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.lab.code;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double num = Double.parseDouble(scanner.nextLine());

            if (num <= 10) {
                System.out.println("slow");
            } else if (num <= 50) {
                System.out.println("average");
            } else if (num <= 150) {
                System.out.println("fast");
            } else if (num <= 1000) {
                System.out.println("ultra fast");
            } else {
                System.out.println("extremely fast");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number (integer or double).");
        }
    }
}