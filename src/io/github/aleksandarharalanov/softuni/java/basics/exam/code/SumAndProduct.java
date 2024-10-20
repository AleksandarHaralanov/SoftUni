package io.github.aleksandarharalanov.softuni.java.basics.exam.code;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean found = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        int sum = a + b + c + d;
                        int multi = a * b * c * d;

                        if (sum == multi && n % 10 == 5) {
                            System.out.printf("%d%d%d%d%n", a, b, c, d);
                            found = true;
                            break;
                        }

                        if (multi / sum == 3 && n % 3 == 0) {
                            System.out.printf("%d%d%d%d%n", d, c, b, a);
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
                if (found) break;
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Nothing found");
        }
    }
}