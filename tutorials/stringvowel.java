package tutorials;

import java.util.Scanner;
class StringVowel {
 public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = reader.nextLine();
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        reader.close();
    }
}