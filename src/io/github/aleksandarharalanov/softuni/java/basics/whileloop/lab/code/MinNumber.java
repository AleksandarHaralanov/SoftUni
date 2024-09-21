package io.github.aleksandarharalanov.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int min = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);
            min = Math.min(num, min);
            input = scanner.nextLine();
        }

        System.out.println(min);
    }
}
