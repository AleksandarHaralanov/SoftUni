package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;

        System.out.println(bgn);
    }
}
