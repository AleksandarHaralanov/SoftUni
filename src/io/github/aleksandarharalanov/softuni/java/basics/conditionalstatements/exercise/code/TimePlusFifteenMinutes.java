package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.exercise.code;

import java.util.Scanner;

public class TimePlusFifteenMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine()) + 15;

        if (minutes >= 60) {
            minutes -= 60;
            hours += 1;
        }

        if (hours >= 24) {
            hours = 0;
        }

        System.out.printf("%d:%02d%n", hours, minutes);
    }
}
