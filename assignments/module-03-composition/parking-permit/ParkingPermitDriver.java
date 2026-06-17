// Programmer: Devin Thomas
// Date: 04/01/2024
// Module 3, Lab 2
// Purpose: Create a main program which utilizes the classes Header, Student and ParkingPermit, 
// receives input from the user and displays the information


package com.cosc.module3;

import java.util.Scanner;

public class ParkingPermitDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Header.displayWelcomeMessage();

        // Collect student information
        System.out.print("Enter student's first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter student's last name: ");
        String lastName = scanner.nextLine();

        // Collecting address details
        System.out.print("Enter street: ");
        String street = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter state: ");
        String state = scanner.nextLine();
        System.out.print("Enter ZIP code: ");
        String zip = scanner.nextLine();
        Address studentAddress = new Address(street, city, state, zip);

        // Collect car information
        System.out.print("Enter car make: ");
        String carMake = scanner.nextLine();
        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();
        System.out.print("Enter car year: ");
        int carYear = scanner.nextInt();

        // Instantiate ParkingPermit and Student objects
        ParkingPermit parkingPermit = new ParkingPermit(carMake, carModel, carYear);
        Student student = new Student(firstName, lastName, studentAddress, parkingPermit);

        // Output student's information and parking permit details
        student.printStudentDetails();

        scanner.close();
    }
}
