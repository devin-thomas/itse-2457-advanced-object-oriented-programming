// Programmer: Devin Thomas
// Date: Apr 7, 2024
// Module 5, Lab 1
// Purpose: create and instantiate salaried and hourly employees that extend the module 3 employee class
// and print their information in a sample program

package com.cosc.module5;

import com.cosc.module3.Address;
import com.cosc.module3.Benefit;

public class EmployeeDriver3 {

    public static void main(String[] args) {
        // Create a Benefit object
        Benefit healthBenefit = new Benefit("Health Insurance", 600.00f, "Acme Health");

        // Create an Address object
        Address homeAddress = new Address("123 Main St", "Anytown", "TX", "12345");

        // Create a Salary employee
        Salary salariedEmployee = new Salary(
                "S001",
                "John",
                "Doe",
                new Benefit(healthBenefit),
                new Address(homeAddress),
                80000.00,
                500.00);

        // Create an Hourly employee
        Hourly hourlyEmployee = new Hourly(
                "H001",
                "Jane",
                "Doe",
                new Benefit(healthBenefit),
                new Address(homeAddress),
                20.00,
                42.00); // Includes 2 hours of overtime

        // Print information
        System.out.println("Salaried Employee Information:");
        salariedEmployee.PrintEmployeeInformation();

        System.out.println("\nHourly Employee Information:");
        hourlyEmployee.PrintEmployeeInformation();
    }
}
