// Programmer: Devin Thomas
// Date: Apr 7, 2024
// Module 5, Lab 1
// Purpose: define a CruiseShip class which extends Ship

package com.cosc.module5;

public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, int yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        setMaxPassengers(maxPassengers);
    }
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = Math.max(0, maxPassengers);
    }

    // toString method overrides
    @Override
    public String toString() {
        return super.toString() + ", Maximum Passengers: " + getMaxPassengers();
    }
}

