package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.exercise.code;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double budget = Double.parseDouble(scanner.nextLine());
            int gpu = Integer.parseInt(scanner.nextLine());
            int cpu = Integer.parseInt(scanner.nextLine());
            int ram = Integer.parseInt(scanner.nextLine());

            int sumGpu = gpu * 250;
            double sumCpu = cpu * (sumGpu * 0.35);
            double sumRam = ram * (sumGpu * 0.1);
            double total = sumGpu + sumCpu + sumRam;

            if (sumGpu > sumCpu + sumRam) {
                total *= 0.85;
            }

            if (budget > total) {
                System.out.printf("You have %.2f leva left!%n", budget - total);
            } else {
                System.out.printf("Not enough money! You need %.2f leva more!%n", total - budget);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer or double).", e);
        }
    }
}
