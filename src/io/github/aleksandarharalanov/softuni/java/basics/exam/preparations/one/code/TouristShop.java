package io.github.aleksandarharalanov.softuni.java.basics.exam.preparations.one.code;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        int count = 0;
        double total = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Stop")) {
                break;
            }

            double price = Double.parseDouble(scanner.nextLine());
            count++;

            if (count % 3 == 0) {
                price /= 2;
            }

            if (budget < price) {
                double need = Math.abs(budget - price);
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!%n", need);
                return;
            }

            total += price;
            budget -= price;
        }

        System.out.printf("You bought %d products for %.2f leva.%n", count, total);
    }
}
