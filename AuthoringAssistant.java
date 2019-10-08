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
      userInput = shortenSpace(userInput);

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

   //replaces all exclamation points with periods
   public static String replaceExclamation(String userInput) {

      userInput = userInput.replace('!', '.');

      return userInput;
   }

   public static int findText(String wordFind, String userInput) {
      int count = 0;
      String placeHolder[] = userInput.split(" ");
      //this makes userInput into a placeholder string array, and splits up to make it easier
      // to search through it character by character

      //searches through placeholder array for the word we search for
      //FIXME this doesn't work for multiple words/a phrase yet
      for(int i = 0; i < placeHolder.length; ++i) {
         if(wordFind.equals(placeHolder[i])) {
            count++;
         }
      }

      return count;
   }

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
      System.out.println();
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
      String wordFind;
      char menuOp = 'o';

      System.out.println("Enter a sample text:\n");
      userInput = scanner.nextLine();
      System.out.println("You entered: " + userInput);


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
               System.out.println("Enter a word or phrase to be found:");
               wordFind = scanner.next();
               //FIXME: for some reason when I use nextLine() it doesn't let me input a string
               // so it doesn't work for phrases yet

               System.out.println( "\"" + wordFind + "\" instances: " + findText(wordFind, userInput));
               break;

            case 'r':
               newInput = replaceExclamation(userInput);
               System.out.println("Edited text:" + newInput);
               break;

            case 's':
               System.out.println("Edited text:" + shortenSpace(userInput));
               break;
         }
      } while (menuOp != 'q');
   }
}