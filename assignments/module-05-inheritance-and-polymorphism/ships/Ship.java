// Programmer: Devin Thomas
// Date: Apr 7, 2024
// Module 5, Lab 1
// Purpose: define a Ship class

package com.cosc.module5;

public class Ship {
    private String name;
    private int yearBuilt;

    public Ship(String name, int yearBuilt) {
        setName(name);
        setYearBuilt(yearBuilt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    // toString method
    @Override
    public String toString() {
        return "Ship Name: " + name + ", Year Built: " + yearBuilt;
    }
}

