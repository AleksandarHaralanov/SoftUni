package io.github.aleksandarharalanov.softuni.java.basics.forloop.exercise.code;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int openTabs = Integer.parseInt(scanner.nextLine());
            int salary = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < openTabs; i++) {
                String tab = scanner.nextLine();
                switch (tab) {
                    case "Facebook":
                        salary -= 150;
                        break;
                    case "Instagram":
                        salary -= 100;
                        break;
                    case "Reddit":
                        salary -= 50;
                        break;
                    default:
                        break;
                }

                if (salary <= 0) {
                    System.out.println("You have lost your salary.");
                    return;
                }
            }

            System.out.println(salary);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
