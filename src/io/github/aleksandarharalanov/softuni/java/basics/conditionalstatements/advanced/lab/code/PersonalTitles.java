package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double age = Double.parseDouble(scanner.nextLine());
            String title = scanner.nextLine();

            switch (title) {
                case "m":
                    if (age >= 16) {
                        System.out.println("Mr.");
                    } else {
                        System.out.println("Master");
                    }
                    break;
                case "f":
                    if (age >= 16) {
                        System.out.println("Ms.");
                    } else {
                        System.out.println("Miss");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
