package profile;

import java.util.Scanner;

/**
 * This class handles user input.
 * It collects the user's name using a Scanner.
 */
public class UserInput {
    private String name;

    // Method to collect user's name
    public void collectName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        scanner.close();
    }

    // Method to return the collected name
    public String getName() {
        return name;
    }
}