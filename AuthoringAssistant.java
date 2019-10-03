import java.util.Scanner;

public class AuthoringAssistant {
   static Scanner scanner = new Scanner(System.in);

   public static int getNumOfNonWSCharacters(String userInput) {
      int count = 0;

      for (int i = 0; i < userInput.length(); i++) {
         if(!Character.isSpaceChar(userInput.charAt(i))) {
            count++;
         }
      }

      return count;
   }

   public static char printMenu() {
       char menuOp;

      System.out.println("MENU");
      System.out.println("c - Number of non-whitespace characters");
      System.out.println("w - Number of words");
      System.out.println("f - Find text");
      System.out.println("r - Replace all !'s");
      System.out.println("s - Shorten spaces");
      System.out.println("q - Quit");
      System.out.println("\nChoose an option:");
      menuOp = scanner.next().charAt(0);
      return menuOp;
   }


   public static void main(String[] args) {
      /* Type your code here. */

      String userInput;
      char menuOp = 'o';

      System.out.println("Enter a sample text:");
      userInput = scanner.nextLine();
      System.out.println("You entered:" + userInput);

      System.out.println(getNumOfNonWSCharacters(userInput));

      char q;
      do {
         menuOp = printMenu();
      } while (menuOp != 'q');
   }
}

