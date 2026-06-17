package com.cosc.module1;

import java.util.Scanner;
import java.util.Random;

public class RNG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // prompt for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // prompt for lower bound
        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();

        // prompt for upper bound and validate
        int upperBound;
        do {
            System.out.print("Enter the upper bound (must be greater than lower bound): ");
            upperBound = scanner.nextInt();
            if(upperBound <= lowerBound) {
                System.out.println("The upper bound must be greater than the lower bound. Please try again.");
            }
        } while(upperBound <= lowerBound);

        // generate and store a random number between the upper and lower bounds (inclusive)
        int randomNumber = lowerBound + random.nextInt(upperBound - lowerBound + 1);

        // output
        System.out.print("Your name: " + name);
        System.out.print("Random number between " + lowerBound + " and " + upperBound + ": " + randomNumber);
    }
}

