package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.lab.code;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String password = scanner.nextLine();

            if (password.equals("s3cr3t!P@ssw0rd")) {
                System.out.println("Welcome");
            } else {
                System.out.println("Wrong password!");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input. Please enter a valid integer.");
        }
    }
}
