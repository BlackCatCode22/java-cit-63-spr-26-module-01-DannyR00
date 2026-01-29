import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reference: https://www.w3schools.com/java/java_type_casting.asp

        System.out.print("Enter a single character: ");

        char myChar = input.next().charAt(0);

        int unicodeValue = (int) myChar;

        boolean isLetter = Character.isLetter(myChar);
        boolean isDigit = Character.isDigit(myChar);

        // 4. Print it all out
        System.out.println("Character: " + myChar);
        System.out.println("Unicode value: " + unicodeValue);
        System.out.println("Is it a letter? " + isLetter);
        System.out.println("Is it a digit? " + isDigit);
    }
}