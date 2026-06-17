// Author: Devin Thomas
// Date 12 Apr 2024
// Purpose: a main function to demonstrate usage of
// Walk, Bus, Bicycle, Drive, TravelMode and DirectionService

package com.cosc.module8.StatePatternLabOne;

public class Lab1 {
    public static void main(String[] args) {

        System.out.println("Walking:");
        var serviceOne = new DirectionService(new Walk());
        serviceOne.getETA();
        serviceOne.getDirection();

        System.out.println("Bus:");
        serviceOne.setTravelMode(new Bus());
        serviceOne.getETA();
        serviceOne.getDirection();

        System.out.println("Bicycle:");
        serviceOne.setTravelMode(new Bicycle());
        serviceOne.getETA();
        serviceOne.getDirection();

        System.out.println("Car:");
        serviceOne.setTravelMode(new Drive());
        serviceOne.getETA();
        serviceOne.getDirection();

    }
}