package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.lab.code;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String town = scanner.nextLine();
            System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for age. Please enter a valid number (integer).");
        }
    }
}
