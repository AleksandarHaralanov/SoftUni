package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.lab.code;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String figure = scanner.nextLine();

            if (figure.equals("square")) {
                double length = Double.parseDouble(scanner.nextLine());
                double formula = Math.pow(length, 2);
                System.out.printf("%.3f", formula);
            } else if (figure.equals("rectangle")) {
                double length1 = Double.parseDouble(scanner.nextLine());
                double length2 = Double.parseDouble(scanner.nextLine());
                double formula = length1 * length2;
                System.out.printf("%.3f", formula);
            } else if (figure.equals("circle")) {
                double radius = Double.parseDouble(scanner.nextLine());
                double formula = Math.PI * Math.pow(radius, 2);
                System.out.printf("%.3f", formula);
            } else if (figure.equals("triangle")) {
                double length = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                double formula = (length * height) / 2;
                System.out.printf("%.3f", formula);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number (integer or double).");
        }
    }
}
