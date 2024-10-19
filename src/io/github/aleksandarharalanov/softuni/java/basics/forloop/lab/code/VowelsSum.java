package io.github.aleksandarharalanov.softuni.java.basics.forloop.lab.code;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int value = 0;

        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'a' -> value += 1;
                case 'e' -> value += 2;
                case 'i' -> value += 3;
                case 'o' -> value += 4;
                case 'u' -> value += 5;
            }
        }

        System.out.println(value);
    }
}
