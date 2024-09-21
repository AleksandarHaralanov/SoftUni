package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        String status = "";

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                    status = (hour >= 10 && hour <= 18) ? "open" : "closed";
            case "Sunday" -> status = "closed";
        }

        System.out.println(status);
    }
}
