// Programmer: Devin Thomas
// Date: Apr 7, 2024
// Module 5, Lab 1
// Purpose: define a CargoShip class which extends Ship

package com.cosc.module5;

public class CargoShip extends Ship {
    private int cargoCapacity; // in tons

    public CargoShip(String name, int yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        setCargoCapacity(cargoCapacity);
    }
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = Math.max(0, cargoCapacity);
    }

    // toString method overrides
    @Override
    public String toString() {
        return super.toString() + ", Cargo Capacity: " + getCargoCapacity() + " tons";
    }
}

