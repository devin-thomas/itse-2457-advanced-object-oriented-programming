// Programmer: Devin Thomas
// Date: 04/01/2024
// Module 3, CLO
// Purpose: define a class which represents a Game Studio

package com.cosc.module3;

public class GameStudio {
    private String studioName;
    private String location;
    private VideoGame publishedGame;

    // Constructor
    public GameStudio(String studioName, String location, VideoGame publishedGame) {
        this.studioName = studioName;
        this.location = location;
        this.publishedGame = new VideoGame(publishedGame); // Using Copy Constructor
    }

    // Getters and Setters
    public String getStudioName() { return studioName; }
    public void setStudioName(String studioName) { this.studioName = studioName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public VideoGame getPublishedGame() { return publishedGame; }
    public void setPublishedGame(VideoGame publishedGame) { this.publishedGame = new VideoGame(publishedGame); } // Using Copy Constructor
}

