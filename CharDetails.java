// References: 
// https://www.w3schools.com/java/java_characters.asp
// https://www.w3schools.com/java/java_conditions.asp

import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        
        // 1. Grab the first character from the user's input string
        char myChar = input.next().charAt(0);

        // 2. Find the Unicode value by "casting" the char to an int
        int unicodeValue = (int) myChar;

        // 3. Use Character class methods to check what it is
        boolean isLetter = Character.isLetter(myChar);
        boolean isDigit = Character.isDigit(myChar);

        // 4. Output the details
        System.out.println("Character: " + myChar);
        System.out.println("Unicode value: " + unicodeValue);
        System.out.println("Is it a letter? " + isLetter);
        System.out.println("Is it a digit? " + isDigit);

        input.close();
    }
}
