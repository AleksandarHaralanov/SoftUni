package io.github.aleksandarharalanov.softuni.java.basics.forloop.lab.code;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < n; i++) {
            sumLeft += scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sumRight += scanner.nextInt();
        }

        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d%n", sumLeft);
        } else {
            int difference = Math.abs(sumLeft - sumRight);
            System.out.printf("No, diff = %d%n", difference);
        }
    }
}
