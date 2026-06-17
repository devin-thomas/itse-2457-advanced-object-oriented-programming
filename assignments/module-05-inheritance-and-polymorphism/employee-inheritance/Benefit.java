package com.cosc.module3;
import java.text.NumberFormat;

public class Benefit {

    //private members
    private String type;
    private float cost;
    private String provider;

    // constructors

    public Benefit(String type, float cost, String provider) {
        this.type = type;
        setCost(cost); // using setter to make sure number gets evaluated
        this.provider = provider;
    }

    public Benefit(Benefit copy) {
        this.type = copy.type;
        setCost(copy.cost); // using setter to make sure number gets evaluated
        this.provider = copy.provider;
    }

    //public getters and setters.
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = Math.max(cost, 0);
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    //print function
    public void PrintBenefitInfo() {
        System.out.println("Benefit Type: " + getType());
        // using NumberFormat to display money
        System.out.println("Cost: " + NumberFormat.getCurrencyInstance().format(getCost()));
        System.out.println("Provider: " + getProvider());
    }
}
