package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.lab.code;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double formula = 0;

        switch (figure) {
            case "square" -> {
                double length = Double.parseDouble(scanner.nextLine());
                formula = Math.pow(length, 2);
            }
            case "rectangle" -> {
                double length1 = Double.parseDouble(scanner.nextLine());
                double length2 = Double.parseDouble(scanner.nextLine());
                formula = length1 * length2;
            }
            case "circle" -> {
                double radius = Double.parseDouble(scanner.nextLine());
                formula = Math.PI * Math.pow(radius, 2);
            }
            case "triangle" -> {
                double length = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                formula = (length * height) / 2;
            }
        }

        System.out.printf("%.3f%n", formula);
    }
}
