package io.github.aleksandarharalanov.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int failed = 0;
        double grades = 0;
        int currentGrade = 1;

        while (currentGrade <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                failed++;
                if (failed == 2) {
                    System.out.printf("%s has been excluded at %d grade%n", name, currentGrade);
                    return;
                }
            } else {
                grades += grade;
                currentGrade++;
            }
        }

        double averageGrade = grades / 12;
        System.out.printf("%s graduated. Average grade: %.2f%n", name, averageGrade);
    }
}
