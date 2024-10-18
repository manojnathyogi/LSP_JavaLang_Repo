package org.howard.edu.lsp.midterm.question2;

public class Calculator {
    // Sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Sum of two double values
    public static double sum(double a, double b) {
        return a + b;
    }

    // Sum of all elements in an integer array
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
}
