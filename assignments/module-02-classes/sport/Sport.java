// Programmer: Devin Thomas
// Date: 03/31/2024
// Module 2, Lab 1
// Purpose: Create a class which represents a Sport

package com.cosc.module2;

public class Sport {
    private String name;
    private int numberOfPlayers;
    private int seasonWins;
    private int seasonLosses;

    // Default constructor
    public Sport() {
        setName("Unknown Team");
        setNumberOfPlayers(0);
        setSeasonWins(0);
        setSeasonLosses(0);
    }

    // Parameterized constructor uses setters for safety and validation
    public Sport(String name, int numberOfPlayers, int seasonWins, int seasonLosses) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setSeasonWins(seasonWins);
        setSeasonLosses(seasonLosses);
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        // using Math.max() to silently reject negative values
        this.numberOfPlayers = Math.max(numberOfPlayers, 0);
    }

    public int getSeasonWins() {
        return seasonWins;
    }

    public void setSeasonWins(int seasonWins) {
        // using Math.max() to silently reject negative values
        this.seasonWins = Math.max(0, seasonWins);
    }

    public int getSeasonLosses() {
        return seasonLosses;
    }

    public void setSeasonLosses(int seasonLosses) {
        // using Math.max() to silently reject negative values
        this.seasonLosses = Math.max(0, seasonLosses);
    }

    // Method to calculate win/loss percentage
    public double getWinLossPercentage() {
        // denominator saved to double to avoid integer division
        double denominator = seasonWins + seasonLosses;
        if (denominator == 0) {
            return 0.0; // Avoid division by zero
        }
        return (100 * (seasonWins / denominator));
    }
}

