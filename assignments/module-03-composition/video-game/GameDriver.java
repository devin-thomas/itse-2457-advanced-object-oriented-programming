// Programmer: Devin Thomas
// Date: 04/01/2024
// Module 3, CLO
// Purpose: Create a main program which utilizes the VideoGame, Character and GameStudio classes, 
// receives input from the user and displays the information

package com.cosc.module3;

import java.util.Scanner;

public class GameDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect Character information
        System.out.print("Enter Character's Name: ");
        String characterName = scanner.nextLine();
        System.out.print("Enter Character's Type: ");
        String characterType = scanner.nextLine();
        System.out.print("Enter Character's Hit Points: ");
        int hitPoints = Integer.parseInt(scanner.nextLine());

        // Instantiate Character
        Character character = new Character(characterName, characterType, hitPoints);

        // Collect Video Game information
        System.out.print("Enter Game Name: ");
        String gameName = scanner.nextLine();
        System.out.print("Enter Game Genre: ");
        String genre = scanner.nextLine();

        // Instantiate VideoGame
        VideoGame videoGame = new VideoGame(gameName, genre, character);

        // Collect Game Studio information
        System.out.print("Enter Studio Name: ");
        String studioName = scanner.nextLine();
        System.out.print("Enter Studio Location: ");
        String location = scanner.nextLine();

        // Instantiate GameStudio
        GameStudio gameStudio = new GameStudio(studioName, location, videoGame);

        // Output the information
        System.out.println("Studio: " + gameStudio.getStudioName() + " located in " + gameStudio.getLocation());
        System.out.println("Published Game: " + gameStudio.getPublishedGame().getGameName());
        System.out.println("Game Genre: " + gameStudio.getPublishedGame().getGenre());
        System.out.println("Main Character: " + gameStudio.getPublishedGame().getMainCharacter().getCharacterName());
        System.out.println("Character Type: " + gameStudio.getPublishedGame().getMainCharacter().getCharacterType());
        System.out.println("HP: " + gameStudio.getPublishedGame().getMainCharacter().getHitPoints());

        scanner.close();
    }
}