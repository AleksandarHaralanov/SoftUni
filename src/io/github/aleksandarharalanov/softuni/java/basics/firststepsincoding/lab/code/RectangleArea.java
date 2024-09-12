package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.lab.code;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int formula = a * b;

            System.out.println(formula);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
