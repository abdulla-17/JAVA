import java.util.Scanner;
public class printint {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = reader.nextInt();
        System.out.println("You entered: " + number);
        reader.close();
    }
}