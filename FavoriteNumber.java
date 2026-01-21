// Reference: https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        // Create the scanner to read from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter your favorite whole number: ");

        // Read an integer from the user
        int favNumber = input.nextInt();

        // Print the number back with a message
        System.out.println("Wow, " + favNumber + " is a great number!");
        System.out.println("If you double it, you get " + (favNumber * 2) + ".");

        // Close the scanner
        input.close();
    }
}
