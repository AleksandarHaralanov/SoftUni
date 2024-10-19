package io.github.aleksandarharalanov.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < n) {
            int curr = Integer.parseInt(scanner.nextLine());
            sum += curr;
        }

        System.out.println(sum);
    }
}
