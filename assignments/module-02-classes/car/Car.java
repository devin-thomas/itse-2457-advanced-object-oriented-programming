// Programmer: Devin Thomas
// Date: 03/31/2024
// Module 2, Lab 2
// Purpose: define a class which represents a Car


package com.cosc.module2;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double mileage;

    // Default Constructor
    public Car() {
        setBrand("");
        setModel("");
        setYear(0);
        setMileage(0.0);
    }

    // Parameterized Constructor uses setters for safety and validation
    public Car(String brand, String model, int year, double mileage) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setMileage(mileage);
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        //Math.max used to silently reject values below 1900
        this.year = Math.max(1900, year);
    }

    public void setMileage(double mileage) {
        //Math.max used to silently reject negative values
        this.mileage = Math.max(0, mileage);
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    public void drive(double miles) {
        //Math.max used to silently reject negative values
        mileage += Math.max(0, miles);
    }
}
