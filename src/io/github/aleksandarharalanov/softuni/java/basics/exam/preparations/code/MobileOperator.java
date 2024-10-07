package io.github.aleksandarharalanov.softuni.java.basics.exam.preparations.code;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contractTerm = scanner.nextLine();
        String contractType = scanner.nextLine();
        String hasCellular = scanner.nextLine();
        int monthsToPay = scanner.nextInt();

        double cost = 0;

        switch (contractTerm) {
            case "one" -> {
                switch (contractType) {
                    case "Small" -> cost = 9.98;
                    case "Middle" -> cost = 18.99;
                    case "Large" -> cost = 25.98;
                    case "ExtraLarge" -> cost = 35.99;
                }
            }
            case "two" -> {
                switch (contractType) {
                    case "Small" -> cost = 8.58;
                    case "Middle" -> cost = 17.09;
                    case "Large" -> cost = 23.59;
                    case "ExtraLarge" -> cost = 31.79;
                }
            }
        }

        if (hasCellular.equals("yes")) {
            cost += (cost <= 10) ? 5.5 : (cost <= 30 ? 4.35 : 3.85);
        }
        cost = contractTerm.equals("two") ? (cost * 0.9625) : cost;

        double total = monthsToPay * cost;

        System.out.printf("%.2f lv.", total);
    }
}
