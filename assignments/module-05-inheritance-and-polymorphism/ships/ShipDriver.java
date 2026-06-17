// Programmer: Devin Thomas
// Date: Apr 7, 2024
// Module 5, Lab 1
// Purpose: perform simple input and output operations with the CruiseShip and CargoShip classes

package com.cosc.module5;

import java.util.Scanner;

public class ShipDriver {

    public static void main(String[] args) {
        String cruiseName, cargoName;

        int cruiseYear, cargoYear, cruisePassengers, cargoTons;

        var scanner = new Scanner(System.in);

        // Collecting cruise ship details
        System.out.print("Enter cruise name: ");
        cruiseName = scanner.nextLine();

        System.out.print("Enter cruise year of build: ");
        cruiseYear = scanner.nextInt();

        System.out.print("Enter maximum number of passengers: ");
        cruisePassengers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left-over

        // Collecting cargo ship details
        System.out.print("Enter cargo name: ");
        cargoName = scanner.nextLine();

        System.out.print("Enter cargo year of build: ");
        cargoYear = scanner.nextInt();

        System.out.print("Enter cargo capacity in tons: ");
        cargoTons = scanner.nextInt();

        // Close the scanner
        scanner.close();


        System.out.println(new CruiseShip(cruiseName, cruiseYear, cruisePassengers));
        System.out.println(new CargoShip(cargoName, cargoYear, cargoTons));
    }

}
