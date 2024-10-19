package io.github.aleksandarharalanov.softuni.java.basics.exam.code;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partyCost = Double.parseDouble(scanner.nextLine());
        int loveMessages = Integer.parseInt(scanner.nextLine());
        int waxRoses = Integer.parseInt(scanner.nextLine());
        int keyChains = Integer.parseInt(scanner.nextLine());
        int caricatures = Integer.parseInt(scanner.nextLine());
        int goodLuckSurprises = Integer.parseInt(scanner.nextLine());

        double finalSum = loveMessages * 0.6 + waxRoses * 7.2 + keyChains * 3.6 + caricatures * 18.2 + goodLuckSurprises * 22;
        int count = loveMessages + waxRoses + keyChains + caricatures + goodLuckSurprises;
        if (count >= 25) {
            finalSum *= 0.65;
        }
        finalSum *= 0.9;

        if (finalSum >= partyCost) {
            double left = finalSum - partyCost;
            System.out.printf("Yes! %.2f lv left.%n", left);
        } else {
            double need = Math.abs(partyCost - finalSum);
            System.out.printf("Not enough money! %.2f lv needed.%n", need);
        }
    }
}
