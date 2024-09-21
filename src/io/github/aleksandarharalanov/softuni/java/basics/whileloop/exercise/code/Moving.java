package io.github.aleksandarharalanov.softuni.java.basics.whileloop.exercise.code;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int spaceLeft = length * width * height;

        while (spaceLeft > 0) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                break;
            } else {
                spaceLeft -= Integer.parseInt(input);
            }
        }

        if (spaceLeft <= 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.%n", Math.abs(spaceLeft));
        } else {
            System.out.printf("%d Cubic meters left.%n", spaceLeft);
        }
    }
}
