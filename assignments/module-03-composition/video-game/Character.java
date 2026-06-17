// Programmer: Devin Thomas
// Date: 04/01/2024
// Module 3, CLO
// Purpose: define a class which represents a Game Character

package com.cosc.module3;


public class Character {
    private String characterName;
    private String characterType;
    private int hitPoints;

    // Constructor
    public Character(String characterName, String characterType, int hitPoints) {
        this.characterName = characterName;
        this.characterType = characterType;
        setHitPoints(hitPoints);
    }

    // Copy Constructor
    public Character(Character copy) {
        this.characterName = copy.characterName;
        this.characterType = copy.characterType;
        setHitPoints(copy.hitPoints);
    }

    // Getters and Setters
    public String getCharacterName() { return characterName; }
    public void setCharacterName(String characterName) { this.characterName = characterName; }

    public String getCharacterType() { return characterType; }
    public void setCharacterType(String characterType) { this.characterType = characterType; }

    public int getHitPoints() { return hitPoints; }

    // Hit points have a minimum of 1
    public void setHitPoints(int hitPoints) { this.hitPoints = Math.max(1, hitPoints); }
}

