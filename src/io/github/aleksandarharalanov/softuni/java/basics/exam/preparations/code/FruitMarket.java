package io.github.aleksandarharalanov.softuni.java.basics.exam.preparations.code;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sbLv = Double.parseDouble(scanner.nextLine());
        double bKg = Double.parseDouble(scanner.nextLine());
        double oKg = Double.parseDouble(scanner.nextLine());
        double rbKg = Double.parseDouble(scanner.nextLine());
        double sbKg = Double.parseDouble(scanner.nextLine());

        double rbLv = sbLv * 0.5;
        double oLv = rbLv * 0.6;
        double bLv = rbLv * 0.2;

        double total = bKg * bLv + oKg * oLv + rbKg * rbLv + sbKg * sbLv;

        System.out.printf("%.2f%n", total);
    }
}
