package io.github.aleksandarharalanov.softuni.java.basics.nestedloops.exercise.code;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        int presentations = 0;
        double totalAverage = 0;

        while (true) {
            String presentation = scanner.nextLine();
            if (presentation.equals("Finish")) {
                break;
            }

            double average = 0;
            for (int i = 0; i < jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                average += grade;
                totalAverage += grade;
            }

            System.out.printf("%s - %.2f.%n", presentation, average / jury);
            presentations++;
        }

        System.out.printf("Student's final assessment is %.2f.%n", totalAverage / (jury * presentations));
    }
}
