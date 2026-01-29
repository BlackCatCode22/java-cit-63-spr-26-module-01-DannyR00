import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create the Scanner
        Scanner input = new Scanner(System.in);

        // Simple Calculator
        // Reference: https://www.w3schools.com/java/java_operators.asp

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();


        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
    }
}