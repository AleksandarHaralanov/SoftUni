package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.exercise.code;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = examHour * 60 + examMinute;
        int arrivalTimeInMinutes = arrivalHour * 60 + arrivalMinutes;
        int difference = arrivalTimeInMinutes - examTimeInMinutes;

        if (difference > 0) {
            System.out.println("Late");
        } else if (difference >= -30) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }

        if (difference != 0) {
            int absDifference = Math.abs(difference);
            if (absDifference < 60) {
                System.out.printf("%d minutes %s the start%n", absDifference, difference > 0 ? "after" : "before");
            } else {
                int hours = absDifference / 60;
                int minutes = absDifference % 60;
                System.out.printf("%d:%02d hours %s the start%n", hours, minutes, difference > 0 ? "after" : "before");
            }
        }
    }
}
