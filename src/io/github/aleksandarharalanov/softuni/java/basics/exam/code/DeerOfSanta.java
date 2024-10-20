package io.github.aleksandarharalanov.softuni.java.basics.exam.code;

import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double deerOne = Double.parseDouble(scanner.nextLine());
        double deerTwo = Double.parseDouble(scanner.nextLine());
        double deerThree = Double.parseDouble(scanner.nextLine());

        double neededFood = days * (deerOne + deerTwo + deerThree);

        if (leftFood >= neededFood) {
            double left = Math.floor((double) leftFood - neededFood);
            System.out.printf("%.0f kilos of food left.%n", left);
        } else {
            double need = Math.ceil(neededFood - (double) leftFood);
            System.out.printf("%.0f more kilos of food are needed.%n", need);
        }
    }
}
