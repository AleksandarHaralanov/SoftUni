package io.github.aleksandarharalanov.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            while (!input.equals("Stop")) {
                System.out.println(input);
                input = scanner.nextLine();
            }
        }
    }
}
