package io.github.aleksandarharalanov.softuni.java.basics.nestedloops.exercise.code;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second; i++) {
            String currentNum = String.format("%d", i);
            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt(String.format("%c", currentNum.charAt(j)));
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }

            if (oddSum == evenSum) {
                System.out.printf("%d ", i);
            }
        }
    }
}
