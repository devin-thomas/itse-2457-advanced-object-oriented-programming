// Programmer: Devin Thomas
// Date: 04/01/2024
// Module 3, CLO
// Purpose: define a class which represents a VideoGame

package com.cosc.module3;

public class VideoGame {
    private String gameName;
    private String genre;
    private Character mainCharacter;

    // Constructor
    public VideoGame(String gameName, String genre, Character mainCharacter) {
        this.gameName = gameName;
        this.genre = genre;
        this.mainCharacter = new Character(mainCharacter); // Using Copy Constructor
    }

    public VideoGame(VideoGame copy) {
        this.gameName = copy.gameName;
        this.genre = copy.genre;
        this.mainCharacter = copy.mainCharacter;
    }

    // Getters and Setters
    public String getGameName() { return gameName; }
    public void setGameName(String gameName) { this.gameName = gameName; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public Character getMainCharacter() { return mainCharacter; }
    public void setMainCharacter(Character mainCharacter) { this.mainCharacter = new Character(mainCharacter); } // Using Copy Constructor
}
