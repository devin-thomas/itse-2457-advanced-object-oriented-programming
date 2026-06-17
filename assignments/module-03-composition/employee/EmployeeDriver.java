// Programmer: Devin Thomas
// Date: 04/01/2024
// Module 3, Lab 1
// Purpose: Create a main program which utilizes the classes Employee, Benefit and Address, 
// receives input from the user and displays the information

package com.cosc.module3;

import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        // Variables to hold user details
        String userID;
        String firstName;
        String lastName;

        // Output welcome message
        System.out.println("Welcome to the Info System");

        // Instantiate a Benefit object
        Benefit employeeBenefit = new Benefit("Dental", 275, "Delta Dental");

        // Instantiate an Address object with the Bellagio Hotel address
        Address employeeHomeAddress = new Address("3600 S Las Vegas Blvd", "Las Vegas", "NV", "89109");


        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for ID, first name, and last name
        System.out.print("Please enter your user ID: ");
        userID = scanner.nextLine();

        System.out.print("Please enter your first name: ");
        firstName = scanner.nextLine();

        System.out.print("Please enter your last name: ");
        lastName = scanner.nextLine();

        // Instantiate an Employee object
        Employee employee = new Employee(userID, firstName, lastName, employeeBenefit, employeeHomeAddress);

        // Output the employee data
        employee.PrintEmployeeInformation();

        // Close the scanner
        scanner.close();
    }
}
