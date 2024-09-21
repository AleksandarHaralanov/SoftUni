package io.github.aleksandarharalanov.softuni.java.basics.nestedloops.exercise.code;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPrime = 0;
        int sumNonPrime = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Number is negative.");
                continue;
            }

            boolean isPrime = true;
            if (num == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                sumPrime += num;
            } else {
                sumNonPrime += num;
            }
        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrime);
    }
}
