// Reference: https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner; // Required to use the Scanner tool

public class SimpleGreeting {
    public static void main(String[] args) {
        // 1. Create a Scanner object named 'input'
        Scanner input = new Scanner(System.in);

        // 2. Prompt the user for their name
        System.out.print("Please enter your name: ");

        // 3. Read the user's input and store it in a String variable
        String name = input.nextLine();

        // 4. Output the personalized greeting using concatenation
        System.out.println("Hello, " + name + "! It's nice to meet you.");

        // 5. Close the scanner (good practice!)
        input.close();
    }
}
