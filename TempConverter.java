// References:
// https://www.w3schools.com/java/java_type_casting.asp
// https://www.w3schools.com/java/ref_output_printf.asp

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Get input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // 2. Calculate Celsius: C = (F - 32) * (5/9)
        // Note: Using 5.0 and 9.0 to ensure decimal division
        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

        // 3. Formatted Output
        // %.2f means "format as a float with 2 decimal places"
        System.out.printf("%.1f degrees Fahrenheit is %.1f degrees Celsius.\n", fahrenheit, celsius);

        input.close();
    }
}
