package io.github.aleksandarharalanov.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String username = scanner.nextLine();
            String password = scanner.nextLine();

            String input = scanner.nextLine();
            while (!input.equals(password)) {
                input = scanner.nextLine();
            }

            System.out.printf("Welcome %s!", username);
        }
    }
}
