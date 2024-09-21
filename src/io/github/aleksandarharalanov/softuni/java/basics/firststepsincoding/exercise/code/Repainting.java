package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.5;
        double paintPrice = (paint + (paint * 0.1)) * 14.5;
        double thinnerPrice = thinner * 5;
        double cost = nylonPrice + paintPrice + thinnerPrice + 0.4;
        double labor = (cost * 0.3) * hours;
        double finalPrice = cost + labor;

        System.out.println(finalPrice);
    }
}
