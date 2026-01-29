import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // 1. Set up the input tool
        Scanner input = new Scanner(System.in);

        // 2. Add your required comment
        // Reference: https://www.w3schools.com/java/java_operators.asp

        // 3. Get the data
        System.out.print("Enter Fahrenheit: ");
        double fahr = input.nextDouble();

        // 4. Do the math (The Logic)
        double cels = (fahr - 32) * (5.0 / 9.0);

        // 5. Output the answer
        System.out.println("Result: " + cels + " Celsius");
    }
}