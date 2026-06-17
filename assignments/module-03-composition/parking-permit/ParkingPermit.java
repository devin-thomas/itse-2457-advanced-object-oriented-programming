// Programmer: Devin Thomas
// Date: 04/01/2024
// Module 3, Lab 2
// Purpose: define a class which represents a Parking Permit

package com.cosc.module3;

import java.util.Random;

public class ParkingPermit {
    private final int permitID; // Permit ID generated within the class, read-only
    private String carMake;
    private String carModel;
    private int carYear;

    // Constructor to initialize the car information
    // setter is used for year to make sure we validate it
    public ParkingPermit(String carMake, String carModel, int carYear) {
        this.carMake = carMake;
        this.carModel = carModel;
        setCarYear(carYear);
        this.permitID = new Random().nextInt(9000) + 1000; // Generates a number between 1000 and 9999
    }

    // Copy constructor
    public ParkingPermit(ParkingPermit original) {
        this.permitID = original.permitID;
        this.carMake = original.carMake;
        this.carModel = original.carModel;
        setCarYear(carYear);
    }

    // Getter for permitID
    public int getPermitID() {
        return permitID;
    }

    // Getters and setters for carMake, carModel, and carYear
    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = Math.max(1900, carYear);
    }

    // Method to print parking permit details
    public void printPermitDetails() {
        System.out.println("Parking Permit ID: " + getPermitID());
        System.out.println("Car Make: " + getCarMake());
        System.out.println("Car Model: " + getCarModel());
        System.out.println("Car Year: " + getCarYear());
    }
}
