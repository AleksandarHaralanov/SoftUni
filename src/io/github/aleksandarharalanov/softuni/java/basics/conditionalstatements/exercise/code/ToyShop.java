package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.exercise.code;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int plushies = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int count = puzzles + dolls + plushies + minions + trucks;
        double earnings = (puzzles * 2.6) + (dolls * 3) + (plushies * 4.1) + (minions * 8.2) + (trucks * 2);

        if (count >= 50) {
            earnings *= 0.75;
        }
        earnings *= 0.9;

        if (earnings >= price) {
            double left = earnings - price;
            System.out.printf("Yes! %.2f lv left.%n", left);
        } else {
            double need = price - earnings;
            System.out.printf("Not enough money! %.2f lv needed.%n", need);
        }
    }
}
