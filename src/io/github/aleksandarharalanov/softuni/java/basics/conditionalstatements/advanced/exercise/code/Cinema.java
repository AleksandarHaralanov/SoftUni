package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.exercise.code;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double income = 0;

        switch (projection) {
            case "Premiere" -> income = rows * columns * 12;
            case "Normal" -> income = rows * columns * 7.5;
            case "Discount" -> income = rows * columns * 5;
        }

        System.out.printf("%.2f leva%n", income);
    }
}
