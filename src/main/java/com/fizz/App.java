package com.fizz;

/**
 * Fizz
 *
 */
public class App {
    public static void main(String[] args) {
        printFizz(7);
    }

    public static void printFizz(int n) {
        if (n < 0) {
            System.out.println("Number must be greater than zero");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

}
