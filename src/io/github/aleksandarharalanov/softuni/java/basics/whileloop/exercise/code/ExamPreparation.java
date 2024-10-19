package io.github.aleksandarharalanov.softuni.java.basics.whileloop.exercise.code;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failedThreshold = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int solvedProblems = 0;
        double gradesSum = 0;
        String lastProblem = "";
        boolean failed = true;

        while (failedTimes < failedThreshold) {
            String problem = scanner.nextLine();
            if (problem.equals("Enough")) {
                failed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                failedTimes++;
            }
            gradesSum += grade;
            solvedProblems++;
            lastProblem = problem;
        }

        if (failed) {
            System.out.printf("You need a break, %d poor grades.%n", failedThreshold);
        } else {
            System.out.printf("Average score: %.2f%n", gradesSum / solvedProblems);
            System.out.printf("Number of problems: %d%n", solvedProblems);
            System.out.printf("Last problem: %s%n", lastProblem);
        }
    }
}
