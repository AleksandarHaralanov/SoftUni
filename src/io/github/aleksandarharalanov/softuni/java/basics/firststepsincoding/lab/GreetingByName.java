package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.lab;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("Hello, %s!", scanner.nextLine());
        }
    }
}
