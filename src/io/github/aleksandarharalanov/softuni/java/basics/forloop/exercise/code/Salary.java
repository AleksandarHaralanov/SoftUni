package io.github.aleksandarharalanov.softuni.java.basics.forloop.exercise.code;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < openTabs; i++) {
            String tab = scanner.nextLine();
            switch (tab) {
                case "Facebook" -> salary -= 150;
                case "Instagram" -> salary -= 100;
                case "Reddit" -> salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }
        }

        System.out.println(salary);
    }
}
