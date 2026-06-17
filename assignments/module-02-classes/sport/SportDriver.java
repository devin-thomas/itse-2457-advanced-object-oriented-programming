// Programmer: Devin Thomas
// Date: 03/31/2024
// Module 2, Lab 1
// Purpose: Create a main program which utilizes the Sport class, 
// receives input from the user and displays the information

package com.cosc.module2;

import java.util.Scanner;

public class SportDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for team details
        System.out.print("Enter team name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of players: ");
        int numberOfPlayers = scanner.nextInt();

        System.out.print("Enter season wins: ");
        int seasonWins = scanner.nextInt();

        System.out.print("Enter season losses: ");
        int seasonLosses = scanner.nextInt();

        // Creating instance of Sport class
        Sport team = new Sport(name, numberOfPlayers, seasonWins, seasonLosses);

        // Displaying team details
        System.out.println("Team Name: " + team.getName());
        System.out.println("Number of Players: " + team.getNumberOfPlayers());
        System.out.println("Season Wins: " + team.getSeasonWins());
        System.out.println("Season Losses: " + team.getSeasonLosses());
        System.out.printf("Win/Loss Percentage: %.2f%%\n", team.getWinLossPercentage());
    }
}

