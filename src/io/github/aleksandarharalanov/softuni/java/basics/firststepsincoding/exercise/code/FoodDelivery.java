package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.4;
        double vegetarianPrice = vegetarian * 8.15;
        double menus = chickenPrice + fishPrice + vegetarianPrice;
        double desserts = menus * 0.2;
        double total = menus + desserts + 2.5;

        System.out.println(total);
    }
}
