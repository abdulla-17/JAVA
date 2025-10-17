package registration;

import java.util.Scanner;

class WelcomeForm {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 

        System.out.println("\nWelcome, " + firstName + "! You are " + age + " years old.");
        scanner.close();
    }
}