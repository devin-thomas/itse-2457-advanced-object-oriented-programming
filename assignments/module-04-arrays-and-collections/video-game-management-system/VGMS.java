// Programmer: Devin Thomas
// Date: Apr 7, 2024
// Module 4, Lab 1
// Purpose:simulate a Video Game Management System, which is a collection of VideoGame objects

package com.cosc.module4;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class VGMS {

    // declaring global menu constants
    static final byte ADD_GAME = 1;
    static final byte DISPLAY_GAMES = 2;
    static final byte SEARCH_TITLE = 3;
    static final byte SEARCH_PLATFORM = 4;
    static final byte QUIT = 5;

    static final byte[] MENU_OPTIONS = {ADD_GAME, DISPLAY_GAMES, SEARCH_TITLE, SEARCH_PLATFORM, QUIT};


    // scanner is global/static so we don't have to pass it around
    // nor do we have to create and close it over and over
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[]args) {
        ArrayList<VideoGame> games = new ArrayList<>();

        while (true) {
            switch (menu()) {
                case ADD_GAME -> addGame(games);

                case DISPLAY_GAMES -> displayInventory(games);

                case SEARCH_TITLE -> searchGames(games, SEARCH_TITLE);

                case SEARCH_PLATFORM -> searchGames(games, SEARCH_PLATFORM);

                case QUIT -> {
                    scanner.close();
                    return;
                }
            }
        }


    }
    public static void addGame(ArrayList<VideoGame> games) {

        String title, genre, platform;
        double price;

        System.out.print("Enter the game's title: ");
        title = scanner.nextLine();
        System.out.print("Enter the game's genre: ");
        genre = scanner.nextLine();
        System.out.print("Enter the game's platform: ");
        platform = scanner.nextLine();
        System.out.print("Enter the game's price in USD: ");
        price = scanner.nextDouble();

        games.add(new VideoGame(title, genre, platform, price));

    }

    public static void displayInventory(ArrayList<VideoGame> games) {
        if (games.isEmpty()) {
            System.out.println("No inventory yet");
            return;
        }
        System.out.println("Displaying inventory...");
        for (VideoGame game: games) System.out.println(game);
    }

    public static void searchGames(ArrayList<VideoGame> games, byte selection) {
        // the user's menu selection is used to determine whether to search for title or platform
        boolean isTitleSearch = selection == 3;
        boolean found = false;
        System.out.printf("Enter the %s you want to search for: ", isTitleSearch ? "title" : "platform");
        String searchTerm = scanner.nextLine();
        for (VideoGame game: games)
            if (searchTerm.equals(isTitleSearch ? game.getTitle() : game.getPlatform())) {
                found = true;
                System.out.println(game);
            }
        // if not found, alert the user
        if (!found) System.out.printf("%s not found.\n", isTitleSearch? "Title" : "Platform");
    }

    // method to handle menu logic and return
    static byte menu() {
        byte selection = 0;

        showMenu();
        selection = scanner.nextByte();
        scanner.nextLine(); // throw away the newline character

        while (!existsInArray(selection, MENU_OPTIONS)) {
            System.out.println("Invalid menu selection entered.");
            showMenu();
            selection = scanner.nextByte();
        }
        return selection;
    }


    // method to handle showing the menu options
    static void showMenu() {
        System.out.println("Please select from options 1-5");
        System.out.println("1: Add game to inventory");
        System.out.println("2: Display game inventory");
        System.out.println("3: Search by game title");
        System.out.println("4: Search by game platform");
        System.out.println("5: Quit");
    }

    // method to check if a byte exists in an array
    static boolean existsInArray(byte subject, byte[] array) {
        for (byte arrayItem: array) if (subject == arrayItem) return true;
        return false;
    }
}


class VideoGame {
    private String title;
    private String genre;
    private String platform;
    private double price;

    // Default Constructor
    public VideoGame() {
        setTitle("");
        setGenre("");
        setPlatform("");
        setPrice(0.0);
    }

    // Parameterized Constructor uses setters for safety and validation
    public VideoGame(String title, String genre, String platform, double price) {
        setTitle(title);
        setGenre(genre);
        setPlatform(platform);
        setPrice(price);
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setPrice(double price) {
        // Math.max used to silently reject negative values
        this.price = Math.max(0.0, price);
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatform() {
        return platform;
    }

    public double getPrice() {
        return price;
    }

    public String getFormattedPrice() {
        return NumberFormat.getCurrencyInstance().format(this.getPrice());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: " + this.getTitle() + '\n');
        sb.append("Genre: " + this.getGenre() + '\n');
        sb.append("Platform: " + this.getPlatform() + '\n');
        sb.append("Price: " + this.getFormattedPrice());
        return sb.toString();
    }
}

