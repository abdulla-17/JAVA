import java.util.Scanner;

class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the limit: ");
    int n = sc.nextInt();
    int firstTerm = 0, secondTerm = 1;

    System.out.println("Fibonacci Series up to " + n + ":");

    while (firstTerm <= n) {
      System.out.print(firstTerm);
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

      if (firstTerm <= n) {
        System.out.print(", ");
      }
    }

    sc.close();
  }
}