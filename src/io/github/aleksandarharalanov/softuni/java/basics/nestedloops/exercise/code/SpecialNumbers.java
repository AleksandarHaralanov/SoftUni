package io.github.aleksandarharalanov.softuni.java.basics.nestedloops.exercise.code;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            String currNum = String.format("%d", i);
            boolean isSpecial = true;
            for (int j = 0; j < currNum.length(); j++) {
                int currDigit = Integer.parseInt(String.format("%c", currNum.charAt(j)));
                if (currDigit == 0 || n % currDigit != 0) {
                    isSpecial = false;
                    break;
                }
            }
            if (isSpecial) {
                System.out.printf("%d ", i);
            }
        }
    }
}
