import java.util.Scanner;

public class AuthoringAssistant {
   static Scanner scanner = new Scanner(System.in);

   //counts non-whitespace characters
   public static int getNumOfNonWSCharacters(String userInput) {
      int count = 0;

      for (int i = 0; i < userInput.length(); i++) {
         if(!Character.isSpaceChar(userInput.charAt(i))) {
            count++;
         }
      }

      return count;
   }

   //counts number of words in string
   public static int getNumOfWords(String userInput) {
      int numWords = 0;

      for(int i = 0; i < userInput.length(); i++) {
         if(Character.isSpaceChar(userInput.charAt(i))) {
            numWords++;
         }
      }
      //this adds one more to the word count to account for the last word w/ no space after
      numWords = numWords + 1;

      return numWords;
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



      char q;
      do {
         menuOp = printMenu();
         switch(menuOp) {
            case 'c':
               System.out.println(getNumOfNonWSCharacters(userInput));
               break;

            case 'w':
               System.out.println(getNumOfWords(userInput));
               break;

            case 'f':
               break;

            case 'r':
               break;

            case 's':
               break;
         }
      } while (menuOp != 'q');
   }
}
