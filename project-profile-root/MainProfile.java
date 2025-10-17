import profile.UserInput;
import greeting.GreetingDisplay;


public class MainProfile {
    public static void main(String[] args) {
      
        UserInput userInput = new UserInput();
        userInput.collectName();

        
        GreetingDisplay greeting = new GreetingDisplay();
        greeting.showGreeting(userInput.getName());
    }
}