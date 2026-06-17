// Programmer: Devin Thomas
// Date: Apr 7, 2024
// Module 5, Lab 1
// Purpose: create an hourly employee that extends the module 3 employee class

package com.cosc.module5;

import com.cosc.module3.Address;
import com.cosc.module3.Benefit;

import java.text.NumberFormat;

public class Hourly extends Employee {

    private double hourlyRate;
    private double hoursWorked;
    public final NumberFormat formatter = NumberFormat.getCurrencyInstance();
    public Hourly(String employeeID, String firstName, String lastName, Benefit employeeBenefit, Address employeeHomeAddress, double hourlyRate, double hoursWorked) {
        super(employeeID, firstName, lastName, employeeBenefit, employeeHomeAddress);
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    public void setHourlyRate(double hourly) {
        this.hourlyRate = Math.max(7.25, hourly);
    }
    public void setHoursWorked(double hours) {
        this.hoursWorked = Math.max(hours, 0.0);
    }

    public double getHourlyRate() { return this.hourlyRate; }

    public double getHoursWorked() { return hoursWorked; }

    public double calculatePay() {
        // if hours are greater than 40, OT is equal to
        // the difference of hoursWorked and 40 times .5 times the hourly rate
        double OT = getHoursWorked() > 40 ? ((getHoursWorked() - 40) * .5 * getHourlyRate()) : 0;
        return (getHourlyRate() * getHoursWorked()) + OT;
    }

    @Override
    public void PrintEmployeeInformation() {
        super.PrintEmployeeInformation();
        System.out.println("Pay for this pay period: " + this.formatter.format(calculatePay()));
    }
}
