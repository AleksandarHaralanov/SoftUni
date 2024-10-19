package io.github.aleksandarharalanov.softuni.java.basics.exam.code;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= a; i += 2) {
            for (int j = 2; j <= b; j++) {
                if (isPrime(j)) {
                    for (int k = 2; k <= c; k += 2) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int k = 2; k * k <= num; k++) {
            if (num % k == 0) {
                return false;
            }
        }
        return true;
    }
}
