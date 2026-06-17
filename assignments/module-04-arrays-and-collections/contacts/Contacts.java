// Programmer: Devin Thomas
// Date: Apr 1, 2024
// Module 4, CLO
// Purpose: This program is designed to use parallel arrays to represent contact information.

package com.cosc.module4;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

    public static void main(String[] args) {

        // constants are declared in many places to avoid as many 'magic numbers' as possible
        final byte NUMBER_OF_CONTACTS = 5;

        // sample data is loaded into the arrays
        String[] firstNames = {"Jesse", "Jack", "Alan", "Beth", "Emily"};
        String[] lastNames = {"Faden", "Joyce", "Wake", "Wilder", "Pope"};
        String[] emails = {"jesse@fbc.gov", "jack@monarch.com", "alan@cauldronlake.com", "beth@quantum.net", "emily@research.fbc.gov"};
        String[] phoneNumbers = {"210-555-0101", "702-555-0202", "818-555-0303", "830-555-0404", "210-555-0505"};

        // the arrays are not defined in a nested form so we can see the names of the fields
        String[][] contactArray = {firstNames, lastNames, emails, phoneNumbers};

        // declaring constant bytes
        final byte FIRST_NAME_INDEX = 0;
        final byte LAST_NAME_INDEX = 1;

        final byte SHOW_ALL = 1;
        final byte SEARCH_LAST = 2;
        final byte SEARCH_FIRST = 3;
        final byte QUIT = 4;
        byte[] menuOptions = {SHOW_ALL, SEARCH_LAST, SEARCH_FIRST, QUIT};

        // using var to avoid saying typename 3 times per line
        var scanner = new Scanner(System.in);

        // infinite loop to show the menu after each query
        while (true) {
            switch (menu(menuOptions, scanner)) {
                case SHOW_ALL:
                    System.out.println("Showing all contacts...");
                    showContacts(contactArray, NUMBER_OF_CONTACTS);
                    break;
                case SEARCH_LAST:
                    System.out.println("Searching by last name...");
                    searchContacts(contactArray, NUMBER_OF_CONTACTS, LAST_NAME_INDEX, scanner);
                    break;
                case SEARCH_FIRST:
                    System.out.println("Searching by first name...");
                    searchContacts(contactArray, NUMBER_OF_CONTACTS, FIRST_NAME_INDEX, scanner);
                    break;
                case QUIT:
                    System.out.println("Quitting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid menu selection entered");
            }
        }
    }

    // method to handle menu logic and return
    static byte menu(byte[] options, Scanner scanner) {
        byte selection = 0;

        showMenu();
        selection = scanner.nextByte();

        while (!existsInArray(selection, options)) {
            System.out.println("Invalid menu selection entered.");
            showMenu();
            selection = scanner.nextByte();
        }
        return selection;
    }


    // method to handle showing the menu options
    static void showMenu() {
        System.out.println("Please select from options 1-4");
        System.out.println("1: Show All Contacts");
        System.out.println("2: Search by last name");
        System.out.println("3: Search by first name");
        System.out.println("4: Quit");
    }

    // method to check if a byte exists in an array
    static boolean existsInArray(byte subject, byte[] array) {
        for (byte arrayItem: array) {
            if (subject == arrayItem) return true;
        }
        return false;
    }

    // stringbuilder is used as many adds are needed before a string is printed
    // dedicating a method to the stringbuilder allows mroe delicate handling without cluttering
    // the showContacts and searchContacts methods with this logic
    static StringBuilder buildContactString(String[][] contactArray, byte index) {
        var sb = new StringBuilder();
        for (byte b = 0; b < contactArray.length; b++) {
            sb.append(contactArray[b][index]);
            switch(b) {
                case 0:
                    sb.append(" ");
                    break;
                case 1:
                    // case 1 intentionally rolls over to 2 because they are the same
                case 2:
                    sb.append(" | ");
                    break;
                case 3:
                    // case 3 breaks so as not to add any additional characters at the end
                    break;
                default:
                    System.out.println("Out of bounds");
                    break;
            }
        }
        return sb;
    }

    // method to show all contacts
    static void showContacts(String[][] contactArray, byte NUMBER_OF_CONTACTS) {

        // a temporary arraylist is created to allow for easier sorting
        ArrayList<String> formattedContactArray = new ArrayList<>();

        var sb = new StringBuilder();
        for (byte contactIndex = 0; contactIndex < NUMBER_OF_CONTACTS; contactIndex++) {
            sb.append(buildContactString(contactArray, contactIndex));
            formattedContactArray.add(sb.toString());
            sb.setLength(0); // setting to 0 to clear the existing StringBuilder
        }

        // array is sorted before it is displayed
        formattedContactArray.sort(null);

        for (String contactString: formattedContactArray) System.out.println(contactString);
    }

    // method to search by first or last name
    static void searchContacts(String[][] contactArray, byte NUMBER_OF_CONTACTS, byte contactArrayIndex, Scanner scanner) {

        // stringbuilder approach is consistent with other methods in this program
        var sb = new StringBuilder();
        sb.append("Enter the ");
        sb.append(contactArrayIndex == 1 ? "last" : "first");
        sb.append(" name you want to search: ");
        System.out.print(sb.toString());

        String userInput = scanner.next();
        scanner.nextLine();

        // simple linear search to find and print any matches, even if more than 1
        boolean found = false;
        for (byte i = 0; i < NUMBER_OF_CONTACTS; i++) {
            if (contactArray[contactArrayIndex][i].equals(userInput)) {
                System.out.println(buildContactString(contactArray, i).toString());
                found = true;
            }
        }

        // only output if search fails
        if (!found) System.out.println("Name not found");
    }
}
