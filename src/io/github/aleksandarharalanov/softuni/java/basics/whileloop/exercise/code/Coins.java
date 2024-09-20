package io.github.aleksandarharalanov.softuni.java.basics.whileloop.exercise.code;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double sum = Double.parseDouble(scanner.nextLine());
            int sumCoins = (int) Math.round(sum * 100);

            int coins = 0;
            while (sumCoins >= 200) {
                sumCoins -= 200;
                coins++;
            }
            while (sumCoins >= 100) {
                sumCoins -= 100;
                coins++;
            }
            while (sumCoins >= 50) {
                sumCoins -= 50;
                coins++;
            }
            while (sumCoins >= 20) {
                sumCoins -= 20;
                coins++;
            }
            while (sumCoins >= 10) {
                sumCoins -= 10;
                coins++;
            }
            while (sumCoins >= 5) {
                sumCoins -= 5;
                coins++;
            }
            while (sumCoins >= 2) {
                sumCoins -= 2;
                coins++;
            }
            while (sumCoins == 1) {
                sumCoins -= 1;
                coins++;
            }

            System.out.println(coins);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer or double).", e);
        }
    }
}
