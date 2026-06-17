// Programmer: Devin Thomas
// Date: 04/01/2024
// Module 3, Lab 1
// Purpose: define a class which represents an Employee

package com.cosc.module3;

public class Employee {
    //private members
    private String employeeID;
    private String firstName;
    private String lastName;
    private Benefit employeeBenefit;

    private Address employeeHomeAddress;
    //public constructor

    public Employee(String employeeID, String firstName, String lastName, Benefit employeeBenefit, Address employeeHomeAddress) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeBenefit = employeeBenefit;
        this.employeeHomeAddress = employeeHomeAddress;
    }

    //public getters and setters

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Benefit getEmployeeBenefit() {
        return employeeBenefit;
    }

    public void setEmployeeBenefit(Benefit employeeBenefit) {
        this.employeeBenefit = employeeBenefit;
    }

    public Address getEmployeeHomeAddress() {
        return employeeHomeAddress;
    }

    public void setEmployeeHomeAddress(Address employeeHomeAddress) {
        this.employeeHomeAddress = employeeHomeAddress;
    }

    public void PrintEmployeeInformation() {
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Benefit Information:");
        employeeBenefit.PrintBenefitInfo(); // Invoking method to print benefit info
        System.out.println("Home Address Information:");
        employeeHomeAddress.PrintAddressInformation(); // Invoking method to print address info
    }
}
