package io.github.aleksandarharalanov.softuni.java.basics.nestedloops.lab.code;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int floors = Integer.parseInt(scanner.nextLine());
            int rooms = Integer.parseInt(scanner.nextLine());

            for (int i = floors; i >= 1; i--) {
                for (int j = 0; j < rooms; j++) {
                    String type;
                    if (i == floors) {
                        type = "L";
                    } else if (i % 2 == 0) {
                        type = "O";
                    } else {
                        type = "A";
                    }
                    System.out.printf("%s%d%d ", type, i, j);
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
