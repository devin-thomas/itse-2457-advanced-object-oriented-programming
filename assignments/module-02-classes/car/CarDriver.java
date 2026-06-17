// Programmer: Devin Thomas
// Date: 03/31/2024
// Module 2, Lab 2
// Purpose: Create a main program which utilizes the Car class, 
// receives input from the user and displays the information

package com.cosc.module2;

import java.util.Scanner;

public class CarDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for car details
        System.out.print("Enter the brand of the car: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();

        System.out.print("Enter the year of production: ");
        int year = scanner.nextInt();

        System.out.print("Enter the current mileage: ");
        double mileage = scanner.nextDouble();

        // Creating a new Car object with the user input
        Car car = new Car(brand, model, year, mileage);

        // Displaying the car's details
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Current Mileage: " + car.getMileage());

        // Prompting the user to drive the car
        System.out.print("\nEnter number of miles to drive: ");
        double milesToDrive = scanner.nextDouble();

        // Driving the car and displaying the new mileage
        car.drive(milesToDrive);
        System.out.println("After driving " + milesToDrive + " miles, the car's new mileage is " + car.getMileage() + ".");
    }
}
