package io.github.aleksandarharalanov.softuni.java.basics.whileloop.exercise.code;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int piecesLeft = length * width;

        while (piecesLeft > 0) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                break;
            } else {
                piecesLeft -= Integer.parseInt(input);
            }
        }

        if (piecesLeft <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.%n", Math.abs(piecesLeft));
        } else {
            System.out.printf("%d pieces are left.%n", piecesLeft);
        }
    }
}
