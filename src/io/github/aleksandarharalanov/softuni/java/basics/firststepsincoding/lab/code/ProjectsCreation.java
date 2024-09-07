package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.lab.code;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            int projects = Integer.parseInt(scanner.nextLine());
            System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, 3 * projects, projects);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Invalid input for projects. Please enter a valid number (integer).");
        }
    }
}
