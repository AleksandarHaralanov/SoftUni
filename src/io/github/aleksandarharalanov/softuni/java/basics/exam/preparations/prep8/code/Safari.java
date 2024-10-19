package io.github.aleksandarharalanov.softuni.java.basics.exam.preparations.prep8.code;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double litres = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double discount = day.equals("Saturday") ? 0.9 : (day.equals("Sunday") ? 0.8 : 1);
        double total = (litres * 2.1 + 100) * discount;

        if (budget >= total) {
            double left = budget - total;
            System.out.printf("Safari time! Money left: %.2f lv.%n", left);
        } else {
            double need = Math.abs(total - budget);
            System.out.printf("Not enough money! Money needed: %.2f lv.%n", need);
        }
    }
}
