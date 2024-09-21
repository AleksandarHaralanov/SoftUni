package io.github.aleksandarharalanov.softuni.java.basics.forloop.exercise.code;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyScore = Double.parseDouble(scanner.nextLine());
        int evaluativeCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < evaluativeCount; i++) {
            String evaluativeName = scanner.nextLine();
            double evaluativeScore = Double.parseDouble(scanner.nextLine());
            academyScore += (evaluativeName.length() * evaluativeScore) / 2;
            if (academyScore > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!%n", actorName, academyScore);
                return;
            }
        }

        System.out.printf("Sorry, %s you need %.1f more!%n", actorName, 1250.5 - academyScore);
    }
}
