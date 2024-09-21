package io.github.aleksandarharalanov.softuni.java.basics.conditionalstatements.advanced.lab.code;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        String title = "";

        switch (sex) {
            case "m" -> title = age >= 16 ? "Mr." : "Master";
            case "f" -> title = age >= 16 ? "Ms." : "Miss";
        }

        System.out.println(title);
    }
}
