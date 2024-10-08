package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.exercise.code;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String top = "";
        String shoes = "";

        switch (time) {
            case "Morning" -> {
                if (degrees >= 10 && degrees <= 18) {
                    top = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degrees > 18 && degrees <= 24) {
                    top = "Shirt";
                    shoes = "Moccasins";
                } else {
                    top = "T-Shirt";
                    shoes = "Sandals";
                }
            }
            case "Afternoon" -> {
                if (degrees >= 10 && degrees <= 18) {
                    top = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees > 18 && degrees <= 24) {
                    top = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    top = "Swim Suit";
                    shoes = "Barefoot";
                }
            }
            case "Evening" -> {
                if (degrees == 10) {
                    top = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees > 18 && degrees <= 24) {
                    top = "Shirt";
                    shoes = "Moccasins";
                } else {
                    top = "Shirt";
                    shoes = "Moccasins";
                }
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.%n", degrees, top, shoes);
    }
}
