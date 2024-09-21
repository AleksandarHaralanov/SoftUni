package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String inRange = (num >= -100 && num <= 100 && num != 0) ? "Yes" : "No";

        System.out.println(inRange);
    }
}
