package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double deposit = Double.parseDouble(scanner.nextLine());
            int term = Integer.parseInt(scanner.nextLine());
            double interestRate = Double.parseDouble(scanner.nextLine()) / 100;
            double accumulatedInterest = deposit * interestRate;
            double monthlyInterest = accumulatedInterest / 12;
            double totalInterest = term * monthlyInterest;
            double sum = deposit + totalInterest;
            System.out.println(sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
