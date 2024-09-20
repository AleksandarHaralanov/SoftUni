package io.github.aleksandarharalanov.softuni.java.basics.nestedloops.lab.code;

public class Clock {
    public static void main(String[] args) {
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                System.out.printf("%d:%d%n", h, m);
            }
        }
    }
}
