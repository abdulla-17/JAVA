package profile;

import java.util.Scanner;


public class UserInput {
    private String name;

   
    public void collectName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        scanner.close();
    }

    
    public String getName() {
        return name;
    }
}