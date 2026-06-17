// Programmer: Devin Thomas
// Date: Apr 7, 2024
// Module 5, Lab 1
// Purpose: create a salaried employee that extends the module 3 employee class

package com.cosc.module5;

import com.cosc.module3.Address;
import com.cosc.module3.Benefit;

import java.text.NumberFormat;

public class Salary extends Employee {

    private double annualSalary;
    private double monthlyBonus;
    public final NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public Salary(String employeeID, String firstName, String lastName, Benefit employeeBenefit, Address employeeHomeAddress, double annualSalary, double monthlyBonus) {
        super(employeeID, firstName, lastName, employeeBenefit, employeeHomeAddress);
        setAnnualSalary(annualSalary);
        setMonthlyBonus(monthlyBonus);
    }

    public double getAnnualSalary() { return this.annualSalary; }
    public double getMonthlyBonus() { return this.monthlyBonus; }

    public void setAnnualSalary(double annual) {
        this.annualSalary = Math.max(0.0, annual);
    }

    public void setMonthlyBonus(double monthly) {
        this.monthlyBonus = Math.max(0.0, monthly);
    }

    public double calculatePay() {
        return (getMonthlyBonus() / 2) + (getAnnualSalary() / 24);
    }

    @Override
    public void PrintEmployeeInformation() {
        super.PrintEmployeeInformation();
        System.out.println("Pay for this pay period: " + this.formatter.format(calculatePay()));
    }
}
