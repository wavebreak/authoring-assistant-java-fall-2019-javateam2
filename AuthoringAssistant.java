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
      System.out.print("Number of non-whitespace characters: ");
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
      System.out.print("Number of words: ");
      return numWords;
   }


//n

   public static String shortenSpace(String usrStr) {
        String space = " ";
        String space2 = space + space;

        while (usrStr.indexOf(space2) != -1) {
            usrStr=usrStr.replace(space2, space);
        }
        return usrStr;
    }

   public static char printMenu() {
      char menuOp;
      System.out.println("\n");
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


      String userInput;
      String newInput;
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
               newInput = replaceExclamation(userInput);
               System.out.println(newInput);
               break;

            case 's':
                System.out.println(shortenSpace(userInput));
               break;
         }
      } while (menuOp != 'q');
   }
}
