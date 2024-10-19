package io.github.aleksandarharalanov.softuni.java.basics.whileloop.exercise.code;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String input = scanner.nextLine();
        int count = 0;
        boolean found = false;

        while (!input.equals("No More Books")) {
            if (input.equals(book)) {
                found = true;
                break;
            }
            count++;
            input = scanner.nextLine();
        }

        if (found) {
            System.out.printf("You checked %d books and found it.%n", count);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.%n", count);
        }
    }
}
