package io.github.aleksandarharalanov.softuni.java.basics.forloop.lab.code;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum1 += (i % 2 == 0) ? num : 0;
            sum2 += (i % 2 != 0) ? num : 0;
        }

        if (sum1 == sum2) {
            System.out.println("Yes");
            System.out.printf("Sum = %d%n", sum1);
        } else {
            int difference = Math.abs(sum1 - sum2);
            System.out.println("No");
            System.out.printf("Diff = %d%n", difference);
        }
    }
}
