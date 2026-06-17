package com.cosc.module2;

public class AverageCalculator {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        System.out.println("The average is: " + calculateAverage(numbers)); // removing unnecessary variable assignment
    }

    private static double calculateAverage(int[] numArray) {
        double sum = 0;
        // using for-each instead since it's an array
        for (int num : numArray) sum += num;
        return (sum / numArray.length);
    }
}
