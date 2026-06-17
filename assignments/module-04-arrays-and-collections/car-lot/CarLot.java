// Programmer: Devin Thomas
// Date: Apr 7, 2024
// Module 4, Lab 1
// Purpose: simulate a Car Lot, which is a collection of Car objects

package com.cosc.module4;

import java.text.NumberFormat; // used to format currency
import java.util.ArrayList; // used to store cars in the lot

public class CarLot {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020, 25000));
        cars.add(new Car("Honda", "Accord", 2018, 23000));
        cars.add(new Car("Ford", "Mustang", 2022, 35000));
        cars.add(new Car("Chevrolet", "Camaro", 2021, 37000));
        cars.add(new Car("Tesla", "Model 3", 2022, 48000));


       displayInventory(cars);
       calculateTotalValue(cars);
    }
    static void displayInventory(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
    static void calculateTotalValue(ArrayList<Car> cars) {
        double total = 0;
        for (Car car : cars) {
            total += car.getPrice();
        }
        System.out.println("Total value of Car Lot: " + NumberFormat.getCurrencyInstance().format(total));
    }
}

class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    // Default Constructor
    public Car() {
        setMake("");
        setModel("");
        setYear(0);
        setPrice(0.0);
    }

    // Parameterized Constructor uses setters for safety and validation
    public Car(String make, String model, int year, double price) {
        setMake(make);
        setModel(model);
        setYear(year);
        setPrice(price);
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        //Math.max used to silently reject values below 1900
        this.year = Math.max(1900, year);
    }

    public void setPrice(double price) {
        //Math.max used to silently reject negative values
        this.price = Math.max(0.0, price);
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() { return year; }

    public double getPrice() {
        return price;
    }

    public String getFormattedPrice() {
        return NumberFormat.getCurrencyInstance().format(this.getPrice());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Make: " + this.getMake() + '\n');
        sb.append("Model: " + this.getModel() + '\n');
        sb.append("Year: " + this.getYear() + '\n');
        sb.append("Price: " + this.getFormattedPrice());
        return sb.toString();
    }

}


