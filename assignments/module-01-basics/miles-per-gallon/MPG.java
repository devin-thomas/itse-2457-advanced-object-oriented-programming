package com.cosc.module1;

import java.util.Scanner;

public class MPG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of miles driven
        System.out.print("Enter the number of miles driven: ");
        double milesDriven = scanner.nextDouble();

        // Prompt the user for the amount of fuel used in gallons
        System.out.print("Enter the amount of fuel used in gallons: ");
        double gallonsUsed = scanner.nextDouble();

        // Calculate miles per gallon (MPG)
        double mpg = milesDriven / gallonsUsed;

        // Output the results
        System.out.println("Miles Driven: " + milesDriven + " miles");
        System.out.println("Gallons Used: " + gallonsUsed + " gallons");
        System.out.println("Miles per Gallon (MPG): " + mpg + " MPG");
    }
}
