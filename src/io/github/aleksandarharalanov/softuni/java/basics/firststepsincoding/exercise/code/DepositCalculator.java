package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double sum = deposit + (term * ((deposit * (interest / 100)) / 12));

        System.out.println(sum);
    }
}
