# Authoring-Assistant-Java

(1) Prompt the user to enter a string of their choosing. Store the text in a string. Output the string. (1 pt) 
<br /><br />
Ex:
```
Enter a sample text:
We'll continue our quest in space.  There will be more shuttle flights and more shuttle crews and,  yes,  more volunteers, more civilians,  more teachers in space.  Nothing ends here;  our hopes and our journeys continue!

You entered: We'll continue our quest in space.  There will be more shuttle flights and more shuttle crews and,  yes,  more volunteers, more civilians,  more teachers in space.  Nothing ends here;  our hopes and our journeys continue!
```
<br /><br />
(2) Implement a printMenu() method, which outputs a menu of user options for analyzing/editing the string, and returns the user's entered menu option.  Each option is represented by a single character. 

If an invalid character is entered, continue to prompt for a valid choice. *Hint: Implement Quit before implementing other options.*
Call printMenu() in the main() method. Continue to call printMenu() until the user enters q to Quit. (3 pts)
<br /><br />
Ex:
```
MENU
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit

Choose an option:
```
<br /><br />
(3) Implement the getNumOfNonWSCharacters() method. getNumOfNonWSCharacters() has a string as a parameter and returns the number of characters in the string, excluding all whitespace. Call getNumOfNonWSCharacters() in the main() method. (4 pts)
<br /><br />
Ex:
```
Enter a sample text:
We'll continue our quest in space.  There will be more shuttle flights and more shuttle crews and,  yes,  more volunteers, more civilians,  more teachers in space.  Nothing ends here;  our hopes and our journeys continue!

You entered: We'll continue our quest in space.  There will be more shuttle flights and more shuttle crews and,  yes,  more volunteers, more civilians,  more teachers in space.  Nothing ends here;  our hopes and our journeys continue!

MENU
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit

Choose an option:
c
Number of non-whitespace characters: 181

```
<br /><br />
(4) Implement the getNumOfWords() method. getNumOfWords() has a string as a parameter and returns the number of words in the string. *Hint: Words end when a space is reached except for the last word in a sentence.* Call getNumOfWords() in the main() method. (3 pts)
<br /><br />
Ex:
```
Number of words: 35
```
<br /><br />
(5) Implement the findText() method, which has two strings as parameters. The first parameter is the text to be found in the user provided sample text, and the second parameter is the user provided sample text. The method returns the number of instances a word or phrase is found in the string. In the main() method, prompt the user for a word or phrase to be found and then call findText() in the main() method. (3 pts)
<br /><br />
Ex:
```
Enter a word or phrase to be found:
more
"more" instances: 5
```
<br /><br />
(6) Implement the replaceExclamation() method. replaceExclamation() has a string parameter and returns a string which replaces each '!' character in the string with a '.' character. replaceExclamation() DOES NOT output the string. Call replaceExclamation() in the main() method, and then output the edited string. (3 pts)
<br /><br />
Ex.
```
Edited text: We'll continue our quest in space.  There will be more shuttle flights and more shuttle crews and,  yes,  more volunteers, more civilians,  more teachers in space.  Nothing ends here;  our hopes and our journeys continue.
```
<br /><br />
(7) Implement the shortenSpace() method. shortenSpace() has a string parameter and returns a string that replaces all sequences of 2 or more spaces with a single space. shortenSpace() DOES NOT output the string. Call shortenSpace() in the main() method, and then output the edited string. (3 pt)
<br /><br />
Ex:
```
Edited text: We'll continue our quest in space. There will be more shuttle flights and more shuttle crews and, yes, more volunteers, more civilians, more teachers in space. Nothing ends here; our hopes and our journeys continue!
```
