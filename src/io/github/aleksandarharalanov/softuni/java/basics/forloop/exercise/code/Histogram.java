package io.github.aleksandarharalanov.softuni.java.basics.forloop.exercise.code;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                count1++;
            } else if (num < 400) {
                count2++;
            } else if (num < 600) {
                count3++;
            } else if (num < 800) {
                count4++;
            } else {
                count5++;
            }
        }

        double p1 = (double) count1 / n * 100;
        double p2 = (double) count2 / n * 100;
        double p3 = (double) count3 / n * 100;
        double p4 = (double) count4 / n * 100;
        double p5 = (double) count5 / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
