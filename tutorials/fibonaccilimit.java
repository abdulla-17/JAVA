import java.util.Scanner;

class Fibonaccilimit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter how many Fibonacci numbers to print: ");
    int n = sc.nextInt();
    int firstTerm = 0, secondTerm = 1;

    System.out.println("First " + n + " Fibonacci numbers:");

    for (int i = 1; i <= n; i++) {
      System.out.print(firstTerm);
      if (i < n) {
        System.out.print(", ");
      }

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }

    sc.close();
  }
}