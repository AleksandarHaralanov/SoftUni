package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());
        double shoes = tax - (tax * 0.4);
        double outfit = shoes - (shoes * 0.2);
        double ball = outfit * 0.25;
        double accessories = ball * 0.2;
        double sum = tax + shoes + outfit + ball + accessories;

        System.out.println(sum);
    }
}
