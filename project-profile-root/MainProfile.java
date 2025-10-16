import profile.UserInput;
import greeting.GreetingDisplay;

/**
 * Main class to simulate the user profile system.
 * It integrates input and greeting modules.
 */
public class MainProfile {
    public static void main(String[] args) {
        // Create an instance of UserInput to collect the name
        UserInput userInput = new UserInput();
        userInput.collectName();

        // Create an instance of GreetingDisplay to show the greeting
        GreetingDisplay greeting = new GreetingDisplay();
        greeting.showGreeting(userInput.getName());
    }
}