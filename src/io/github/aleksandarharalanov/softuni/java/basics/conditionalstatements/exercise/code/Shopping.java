package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.exercise.code;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int gpu = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        int sumGpu = gpu * 250;
        double sumCpu = cpu * (sumGpu * 0.35);
        double sumRam = ram * (sumGpu * 0.1);
        double total = sumGpu + sumCpu + sumRam;

        if (gpu > cpu) {
            total *= 0.85;
        }

        if (budget >= total) {
            double left = budget - total;
            System.out.printf("You have %.2f leva left!%n", left);
        } else {
            double need = total - budget;
            System.out.printf("Not enough money! You need %.2f leva more!%n", need);
        }
    }
}
