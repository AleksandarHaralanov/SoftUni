package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int length = Integer.parseInt(scanner.nextLine());
            int width = Integer.parseInt(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double percent = Double.parseDouble(scanner.nextLine());

            int aquariumVolume = length * width * height;
            double litersVolume = aquariumVolume * 0.001;
            double litersNeeded = litersVolume * (1 - (percent / 100));

            System.out.println(litersNeeded);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer or double).", e);
        }
    }
}
