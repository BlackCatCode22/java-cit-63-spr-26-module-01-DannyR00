import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create the Scanner for user input
        Scanner input = new Scanner(System.in);

        // Reference: https://www.w3schools.com/java/java_user_input.asp

        // 1. Get the Principal (Initial investment/loan)
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        // 2. Get the Rate (Interest rate as a decimal, e.g., 0.05 for 5%)
        System.out.print("Enter the annual interest rate (decimal): ");
        double rate = input.nextDouble();

        // 3. Get the Time (Duration in years)
        System.out.print("Enter the time in years: ");
        double time = input.nextDouble();

        // 4. Calculate Interest: I = P * R * T
        double interest = principal * rate * time;

        // 5. Output the result
        System.out.println("The simple interest for " + time + " years is: $" + interest);
    }
}