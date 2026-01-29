// URL: https://www.w3schools.com/java/java_user_input.asp
import java.util.Scanner;

public class SimpleGreeting {
    public static void main(String[] args) {
        // 1. Create the Scanner
        Scanner input = new Scanner(System.in);

        // 2. Ask the user a question
        System.out.println("Please enter your name:");

        // 3. Wait for the user to type and save it in a variable
        String name = input.nextLine();

        // 4. Use the variable in a sentence
        System.out.println("Hi " + name + ", hope you're having a good day!");
    }
}