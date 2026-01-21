// Reference: https://www.w3schools.com/java/java_operators.asp

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Collect the three components of the formula
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 5.5): ");
        double rate = input.nextDouble();

        System.out.print("Enter the time in years: ");
        double time = input.nextDouble();

        // 2. Perform the calculation
        double interest = (principal * rate * time) / 100;

        // 3. Output the results
        System.out.println("\n--- Loan Summary ---");
        System.out.println("Principal: $" + principal);
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Total Interest Earned: $" + interest);

        input.close();
    }
}
