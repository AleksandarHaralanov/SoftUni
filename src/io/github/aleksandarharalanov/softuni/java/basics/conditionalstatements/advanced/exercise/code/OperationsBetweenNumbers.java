package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.exercise.code;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            String operator = scanner.nextLine();

            switch (operator) {
                case "+":
                    int sum = num1 + num2;
                    String evenOrOddSum = (sum % 2 == 0) ? "even" : "odd";
                    System.out.printf("%d %s %d = %d - %s%n", num1, operator, num2, sum, evenOrOddSum);
                    break;
                case "-":
                    int difference  = num1 - num2;
                    String evenOrOddDifference = (difference  % 2 == 0) ? "even" : "odd";
                    System.out.printf("%d %s %d = %d - %s%n", num1, operator, num2, difference , evenOrOddDifference);
                    break;
                case "*":
                    int multiple = num1 * num2;
                    String evenOrOddMultiple= (multiple  % 2 == 0) ? "even" : "odd";
                    System.out.printf("%d %s %d = %d - %s%n", num1, operator, num2, multiple , evenOrOddMultiple);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.printf("Cannot divide %d by zero%n", num1);
                    } else {
                        double division = (double) num1 / num2;
                        System.out.printf("%d %s %d = %.2f%n", num1, operator, num2, division);
                    }
                    break;
                case "%":
                    if (num2 == 0) {
                        System.out.printf("Cannot divide %d by zero%n", num1);
                    } else {
                        int remainder = num1 % num2;
                        System.out.printf("%d %s %d = %d%n", num1, operator, num2, remainder);
                    }
                    break;
                default:
                    break;
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
