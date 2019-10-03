import java.util.Scanner;

public class AuthoringAssistant {
   static Scanner scanner = new Scanner(System.in);


   public static void printMenu() {
      System.out.println("MENU");
      System.out.println("c - Number of non-whitespace characters");
      System.out.println("w - Number of words");
      System.out.println("f - Find text");
      System.out.println("r - Replace all !'s");
      System.out.println("s - Shorten spaces");
      System.out.println("q - Quit");
      System.out.println("\nChoose an option:");

   }


   public static void main(String[] args) {
      /* Type your code here. */

      String userInput;
      char menuOp = 'o';

      System.out.println("Enter a sample text:");
      userInput = scanner.nextLine();
      System.out.println("You entered:" + userInput);

      char q;
      do {
         printMenu();
      } while (menuOp != 'q');
   }
}

