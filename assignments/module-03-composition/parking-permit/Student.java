// Programmer: Devin Thomas
// Date: 04/01/2024
// Module 3, Lab 2
// Purpose: define a class which represents a Student

package com.cosc.module3;

public class Student {
    private String firstName;
    private String lastName;
    private Address address;
    private ParkingPermit parkingPermit;

    // Constructor
    public Student(String firstName, String lastName, Address address, ParkingPermit parkingPermit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.parkingPermit = parkingPermit;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public ParkingPermit getParkingPermit() {
        return parkingPermit;
    }

    // Method to print student information and parking permit details
    public void printStudentDetails() {
        System.out.println("Student Name: " + getFirstName() + " " + getLastName());
        getAddress().PrintAddressInformation();
        getParkingPermit().printPermitDetails();
    }
}
