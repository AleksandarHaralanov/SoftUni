package io.github.aleksandarharalanov.softuni.java.basics.exam.code;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        int achieved = 0;

        while (true) {
            if (achieved >= target) {
                System.out.println("You have reached your target for the day!");
                System.out.printf("Earned money: %dlv.%n", achieved);
                return;
            }

            String input = scanner.nextLine();
            if (input.equals("closed")) {
                System.out.printf("Target not reached! You need %dlv. more.%n", target - achieved);
                System.out.printf("Earned money: %dlv.%n", achieved);
                return;
            }

            switch (input) {
                case "haircut" -> {
                    input = scanner.nextLine();
                    switch (input) {
                        case "mens" -> achieved += 15;
                        case "ladies" -> achieved += 20;
                        case "kids" -> achieved += 10;
                    }
                }
                case "color" -> {
                    input = scanner.nextLine();
                    switch (input) {
                        case "touch up" -> achieved += 20;
                        case "full color" -> achieved += 30;
                    }
                }
            }
        }
    }
}
