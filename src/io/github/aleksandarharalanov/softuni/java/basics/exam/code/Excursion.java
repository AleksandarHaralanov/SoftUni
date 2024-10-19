package io.github.aleksandarharalanov.softuni.java.basics.exam.code;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int cards = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());

        double finalSum = ((nights * 20 + cards * 1.6 + tickets * 6) * people) * 1.25;

        System.out.printf("%.2f%n", finalSum);
    }
}
