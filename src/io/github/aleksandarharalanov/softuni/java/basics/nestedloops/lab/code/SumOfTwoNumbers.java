package io.github.aleksandarharalanov.softuni.java.basics.nestedloops.lab.code;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        int combinations = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinations++;
                if (i + j == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combinations, i, j, magic);
                    return;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d%n", combinations, magic);
    }
}
